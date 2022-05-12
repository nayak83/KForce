package com.generali.burritoorderingservice.model.stub;

import java.util.ArrayList;
import java.util.List;

import com.generali.burritoorderingservice.model.Order;

public class OrderData {
	
	
	public static List<Order> getListOfOrder()
	{
		List<Order> orders = new ArrayList<Order>();
		
		Order order = new Order("corn", "bean", new String[] {"cabbage","jalapenos"}, "hot", "avocado");
		
		orders.add(order);
		
		return orders;
	}

}
