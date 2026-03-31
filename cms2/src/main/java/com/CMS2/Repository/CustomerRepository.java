package com.CMS2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}
