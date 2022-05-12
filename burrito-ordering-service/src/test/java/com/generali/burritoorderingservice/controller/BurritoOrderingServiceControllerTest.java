package com.generali.burritoorderingservice.controller;

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
public class BurritoOrderingServiceControllerTest {

	@Autowired
	BurritoOrderingServiceController burritoOrderingServiceController;
	
	/**
	 * E2E Integration test case which compares input order against order retrieval based on order id.
	 */
	@Test
	public void testPostAndGetOrder() {
		
		List<Order> inputOrders = OrderData.getListOfOrder();
		String authorization = "authorizationToken";
		
		int orderId = burritoOrderingServiceController.postOrder(inputOrders, authorization);
		
		List<Order> outputOrders = burritoOrderingServiceController.getOrder(orderId);
		
		Assert.assertEquals(inputOrders,outputOrders);
		
	}
	
	//TODO: Multiple test cases can be added for different scenarios
}
