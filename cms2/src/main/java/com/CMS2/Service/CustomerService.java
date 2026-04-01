package com.CMS2.Service;

import com.CMS2.Entity.Customer;




public interface CustomerService {
	
	boolean validate(Customer cus);

	String addUser(Customer cus);
	

}
