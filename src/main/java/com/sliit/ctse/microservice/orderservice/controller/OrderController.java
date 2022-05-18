package com.sliit.ctse.microservice.orderservice.controller;

import com.sliit.ctse.microservice.orderservice.dto.OrderRequest;
import com.sliit.ctse.microservice.orderservice.dto.OrderResponse;
import com.sliit.ctse.microservice.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody OrderResponse selectProduct(@RequestBody OrderRequest request) {
		
		System.out.println("Order Details : " +  request); 
		
		return orderServiceImpl.makePayment(request);
		
	}

}
