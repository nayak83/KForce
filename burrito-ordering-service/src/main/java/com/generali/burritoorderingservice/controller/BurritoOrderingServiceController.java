package com.generali.burritoorderingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generali.burritoorderingservice.model.Order;
import com.generali.burritoorderingservice.service.BurritoOrderingService;

@RestController
@RequestMapping(value = "/v1")
public class BurritoOrderingServiceController {
	
	@Autowired
	private BurritoOrderingService burritoOrderingService;
	
	
	/**
	 * Method which maps post request which saves incoming orders.
	 * @param orders
	 * @param authorization
	 * @return
	 */
	@PostMapping(value = "/orders")
	public int postOrder(@RequestBody List<Order> orders, @RequestHeader (value="Authorization", required=true) String authorization) {
		
		if(validateOrderInputs(orders)) {
			return burritoOrderingService.processOrder(orders);
		}
		
		return 9999;
		
	}
	
	/**
	 * 
	 * @param orders
	 * @return
	 */
	private boolean validateOrderInputs(List<Order> orders) {
		// TODO Add validations for order as per requirement.
		/*
		 * An order consists of:
			* Tortilla (one of):  {corn, flour}
			* Protein (one of):  {bean, beef, chicken, pork, shrimp, steak}
			* Vegetables  (zero or more of):  {cabbage, corn, jalapenos}
			* Salsa  (one of):  {mild, medium, hot}
			* Extras  (zero or more of):  {avocado}
		 */
		return true;
	}


	/**
	 * Method which maps get request to retrieve orders.
	 * @param orderId
	 * @return
	 */
	@GetMapping (value = "/orders/{orderId}")
	public List<Order> getOrder(@PathVariable("orderId") Integer orderId) {
		
		return burritoOrderingService.getOrder(orderId);
		
	}


}
