package com.org.Harsha.service;

import com.org.Harsha.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerSrevice {
    public void createcustomer (Customer customer);
    public void updateCustomer (Customer customer);
    public List<Customer> getAll();
    public String deleteById(Integer id);
    public Optional<Customer> getById(Integer id);
    }
