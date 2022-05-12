package com.generali.burritoorderingservice.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.model.stub.OrderData;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderRepositoryTest{
	
	@Autowired 
	OrderRepository orderRepository;
	
	@Test
	public void testOrderRepository() {
		
		
		List<Order> inputOrders = OrderData.getListOfOrder();
		int orderId = orderRepository.save(inputOrders);
		
		List<Order> outputOrders = orderRepository.retrieve(orderId);
		
		Assert.assertEquals(inputOrders,outputOrders);
		
		
	}
}
