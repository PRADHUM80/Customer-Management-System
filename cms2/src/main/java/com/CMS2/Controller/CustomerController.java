package com.CMS2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS2.Entity.Customer;
import com.CMS2.Service.CustomerService;


@RestController
public class CustomerController {

	
	CustomerService cService;

	public CustomerController(CustomerService cService) {
		super();
		this.cService = cService;
	}
	
	
	@PostMapping("/login")
	public String login(@RequestBody Customer cus) {
		if(cService.validate(cus))
			return "login success!";
		else
			return "login fail";
	}
}
