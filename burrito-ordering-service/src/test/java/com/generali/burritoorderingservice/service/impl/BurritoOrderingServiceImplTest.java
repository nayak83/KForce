package com.generali.burritoorderingservice.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.model.stub.OrderData;
import com.generali.burritoorderingservice.repository.OrderRepository;
import com.generali.burritoorderingservice.service.BurritoOrderingService;

@SpringBootTest
public class BurritoOrderingServiceImplTest {
	
	@Autowired
	BurritoOrderingService burritoOrderingService;
	
	@InjectMocks
	OrderRepository orderRepository;
	
	List<Order> inputOrders;
	
	@Before
	public void setup() {
		ReflectionTestUtils.setField(burritoOrderingService, "orderRepository", orderRepository);
		inputOrders = OrderData.getListOfOrder();
		when(orderRepository.save(inputOrders)).thenReturn(1);
		when(orderRepository.retrieve(anyInt())).thenReturn(inputOrders);
	}
	
	
	@Test
	public void testProcessOrder() {
		
		int orderId = burritoOrderingService.processOrder(inputOrders);		
		assertNotNull(orderId);
	}
	
	@Test
	public void testGetOrder() {
		
		List<Order> outputOrders = burritoOrderingService.getOrder(1);		
		assertNotNull(outputOrders);
	}
	
}
