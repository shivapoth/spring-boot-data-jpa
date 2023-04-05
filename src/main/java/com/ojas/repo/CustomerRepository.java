package com.ojas.repo;

import org.springframework.data.repository.CrudRepository;

import com.ojas.entity.Customer;

public interface CustomerRepository  extends CrudRepository<Customer, Integer>{

}
