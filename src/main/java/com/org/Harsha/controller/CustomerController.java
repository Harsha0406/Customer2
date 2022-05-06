package com.org.Harsha.controller;

import com.org.Harsha.model.Customer;
import com.org.Harsha.service.CustomerSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api")
public class CustomerController {
    @Autowired
    CustomerSrevice customerSrevice;
    @PostMapping ("/create")
    public void createCustomer (@RequestBody Customer customer){
        customerSrevice.createcustomer(customer);
    }
    @PutMapping("/update")
    public void updateCustomer (@RequestBody Customer customer) {
        customerSrevice.updateCustomer(customer);

    }
    @GetMapping("/getAll")
    public List<Customer> getAll(){
        List<Customer> ss = customerSrevice.getAll();
        return ss;

    }
@DeleteMapping("/deleteById/{id}")
 public String deleteById(@PathVariable Integer id) {
    String rrr = customerSrevice.deleteById(id);
           return rrr;
}
 @GetMapping("/getById/{id}")
    public Optional<Customer> getById(@PathVariable Integer id){
     Optional<Customer> jjj   = customerSrevice.getById(id);
       return jjj;
 }

}
