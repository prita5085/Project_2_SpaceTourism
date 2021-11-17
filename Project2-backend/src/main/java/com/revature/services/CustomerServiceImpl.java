package com.revature.services;

import com.revature.models.Customer;
import com.revature.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo cr;


    @Override
    public Customer getCustomer(int id) {return cr.findById(id).get();}

    @Override
    public List<Customer> getAllCustomers() {return (List<Customer>) cr.findAll();}

    @Override
    public Customer addCustomer(Customer c) { return cr.save(c); }

    @Override
    public Customer updateCustomer(Customer change) { return cr.save(change);}

    @Override
    public boolean deleteCustomer(int id) {
        try {
            cr.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
