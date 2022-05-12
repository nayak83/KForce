package com.generali.burritoorderingservice.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.generali.burritoorderingservice.model.Order;
@Component
public class OrderRepository implements ObjectRepository<Order>{

	
	private Map<Integer, List<Order>> repository;
	
	public static int orderId=0;
	
	public OrderRepository(Map<Integer, List<Order>> repository) {
		super();
		this.repository = new HashMap<>();;
	}

	@Override
	public int save(List<Order> t) {		
		
		repository.put(++orderId, t);
		
		return orderId;
	}

	@Override
	public List<Order> retrieve(Integer id) {
		return repository.get(id);
	}

}
