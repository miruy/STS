package com.example.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerApiServiceImpl implements CustomerApiService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String getCustomerDetail(String customerId) {
		return restTemplate.getForObject("http://localhost:8082/customers/" + customerId , String.class);
	}
}
