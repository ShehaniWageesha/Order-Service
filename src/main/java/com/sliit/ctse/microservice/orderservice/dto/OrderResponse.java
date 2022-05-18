package com.sliit.ctse.microservice.orderservice.dto;

import lombok.Data;

@Data
public class OrderResponse {
	
	private String orderId;
	
	private String paymentId;
	
	private String message;

}
