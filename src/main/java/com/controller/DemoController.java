package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.model.CustomerRepository;


@RestController
public class DemoController {
	
	@Autowired
    CustomerRepository repository;

	@RequestMapping("/create")
	public  String addEmployee(){
		repository.save(new Customer("Jack", "Smith"));
		return "Done";
	}
}
