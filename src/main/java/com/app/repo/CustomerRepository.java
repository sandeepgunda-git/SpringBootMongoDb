package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

	
}
