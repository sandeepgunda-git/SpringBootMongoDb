package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Customer;
import com.app.repo.CustomerRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Customer("JOHN","SEYN",23.36,1.23));
		repo.findAll().forEach(System.out::println);
		System.out.println("-----------------");
	}

}
