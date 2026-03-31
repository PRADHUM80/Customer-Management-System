package com.CMS2.Service;

import org.springframework.stereotype.Service;

import com.CMS2.Entity.Customer;
import com.CMS2.Repository.CustomerRepository;


@Service
public class CustomerServiceImplementation  implements CustomerService{

	CustomerRepository cusRepo;

	
	public CustomerServiceImplementation(CustomerRepository cusRepo) {
		super();
		this.cusRepo = cusRepo;
	}


	@Override
	public boolean validate(Customer cus) {

		Customer dbPass = cusRepo.findById(cus.getId()).orElse(null);
	    return dbPass.getPassword().equals(cus.getPassword());
	} 

}
