package com.zee.data.dataread.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zee.data.dataread.dtos.OrderEntityDto;
import com.zee.data.dataread.dtos.SubOrderEntityDto;
import com.zee.data.dataread.entity.OrderEntity;
import com.zee.data.dataread.entity.SubOrderEntity;
import com.zee.data.dataread.repository.OrderRepo;
import com.zee.data.dataread.repository.SubOrderRepo;
import com.zee.data.dataread.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;

	@Autowired
	SubOrderRepo subOrderRepo;

	@Override
	public List<SubOrderEntityDto> subOrderRead() {
		List<SubOrderEntityDto> subOrderEntityDtos = new ArrayList<>();

		PageRequest pagination = PageRequest.of(0, 10);

		Page<SubOrderEntity> subOrderPage = subOrderRepo.findByPstDataFlagIsNull(pagination);
		List<SubOrderEntity> subOrderList = subOrderPage.getContent();

		for (SubOrderEntity subOrderEntity : subOrderList) {

			ObjectMapper mapper = new ObjectMapper();
			List<OrderEntityDto> orderEntityDtos = new ArrayList<>();
			SubOrderEntityDto subOrderEntityDto = mapper.convertValue(subOrderEntity, SubOrderEntityDto.class);
			String orderNumber = subOrderEntity.getOrderNumber();
			List<OrderEntity> orderList = orderRepo.findByOrderId(orderNumber);

			for (OrderEntity orderEntity : orderList) {

				OrderEntityDto orderEntityDto = mapper.convertValue(orderEntity, OrderEntityDto.class);
				orderEntityDtos.add(orderEntityDto);
				subOrderEntityDto.setPstOrder(orderEntityDtos);
			}
			subOrderEntityDtos.add(subOrderEntityDto);
			subOrderEntity.setPstDataFlag("Y");

		}

		subOrderRepo.saveAll(subOrderList);

		return subOrderEntityDtos;

	}

}
