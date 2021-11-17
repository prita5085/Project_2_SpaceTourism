package com.revature.controllers;

import com.revature.models.Customer;
import com.revature.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class CustomerController {

    @Autowired
    CustomerService cs;

    @PostMapping(value = "/customer", consumes = "application/json", produces = "application/json")
    public Customer addCustomer(@RequestBody Customer c) {return cs.addCustomer(c);}

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return cs.getCustomer(Integer.parseInt(id));
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {return cs.getAllCustomers();}

    @PutMapping(value = "/customer/{id}", consumes = "application/json", produces = "application/json")
    public Customer updateCustomer(@PathVariable("id") String id, @RequestBody Customer change) {
        change.setC_id(Integer.parseInt(id));
        return cs.updateCustomer(change);
    }

    @DeleteMapping("/customer/{id}")
    public boolean deleteCustomer(@PathVariable("id") String id) { return cs.deleteCustomer(Integer.parseInt(id));}


}
