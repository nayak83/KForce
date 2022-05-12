package com.generali.burritoorderingservice.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderTest {
		
	@Autowired
	Order order;
	
	@Test
	public void testOrderObject() {
		
		order=new Order("corn", "bean", new String[] {"cabbage","jalapenos"}, "hot", "avocado");
		Assert.assertNotNull(order);
		
	}
}
