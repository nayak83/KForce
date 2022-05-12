package com.generali.burritoorderingservice.service;

import java.util.List;

import com.generali.burritoorderingservice.model.Order;

public interface BurritoOrderingService {
	
	public int processOrder(List<Order> order);
	public List<Order> getOrder(Integer orderId);

}
