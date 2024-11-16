package com.andyalex.nathycustomer.service;

import com.andyalex.nathycustomer.entity.Customer;
import com.andyalex.nathycustomer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return (List<Customer>) this.customerRepository.findAll();
    }

    public Customer findCustomerById(Long id) {
        return this.customerRepository.findById(id).get();
    }

    public void saveAll(List<Customer> listCustomer) {
        this.customerRepository.saveAll(listCustomer);
    }
}
