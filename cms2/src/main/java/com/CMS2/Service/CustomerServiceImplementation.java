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


	@Override
    public String addUser(Customer cus) {

        Customer existingUser = cusRepo.findByUsername(cus.getUsername());

//        Check username Exists or not
//        
//        if (existingUser != null) {
//            return "❌ Register Failed - Username already exists";
//        }
//
//        cusRepo.save(cus);
//        return " Register Successful";
        
        String uName = cus.getUsername();
        Customer dbCus = cusRepo.findByUsername(uName);
        boolean exists = (dbCus != null);
        
        if(exists == true)
        	return "username already exists!";
        
        else {
        	cusRepo.save(cus);
        	return "user added successfully!";
        }
    }

}
