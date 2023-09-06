package com.zee.data.dataread.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zee.data.dataread.dtos.SubOrderEntityDto;

@Service
public interface OrderService {

	List<SubOrderEntityDto> subOrderRead();

}
