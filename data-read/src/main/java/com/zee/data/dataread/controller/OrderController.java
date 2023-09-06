package com.zee.data.dataread.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.data.dataread.dtos.SubOrderEntityDto;
import com.zee.data.dataread.service.OrderService;

@RestController
@RequestMapping("data/read")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/order")
	public List<SubOrderEntityDto> getSubOrderDetails() {

		return orderService.subOrderRead();

	}

}
