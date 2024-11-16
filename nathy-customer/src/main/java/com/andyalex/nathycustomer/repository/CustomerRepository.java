package com.andyalex.nathycustomer.repository;

import com.andyalex.nathycustomer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
