package com.org.Harsha.service;

import com.org.Harsha.model.Customer;
import com.org.Harsha.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerSrevice{
@Autowired
    CustomerRepo customerRepo;
    @Override
    public void createcustomer(Customer customer) {
        customerRepo.save(customer);
    }
    @Override
    public void updateCustomer(Customer customer) {
        customerRepo.save(customer);
    }
    @Override
    public List<Customer> getAll() {
        List<Customer> sss=customerRepo.findAll();
        return sss;
    }

    @Override
    public String deleteById(Integer id) {
        customerRepo.deleteById(id);
        return "Success";
    }

    @Override
    public Optional<Customer> getById(Integer id) {
        Optional<Customer> kkk= Optional.of((customerRepo.getById(id)));
        return kkk;
    }
}
