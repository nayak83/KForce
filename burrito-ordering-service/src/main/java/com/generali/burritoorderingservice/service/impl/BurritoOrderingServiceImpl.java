package com.generali.burritoorderingservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.repository.OrderRepository;
import com.generali.burritoorderingservice.service.BurritoOrderingService;

@Service
public class BurritoOrderingServiceImpl implements BurritoOrderingService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public int processOrder(List<Order> order) {
		// TODO null check or validations
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrder(Integer orderId) {
		// TODO null check or validations
		return orderRepository.retrieve(orderId);
	}

}
