package com.revature.services;

import com.revature.models.Customer;

import java.util.List;

public interface CustomerService {

    public Customer getCustomer(int id);
    public List<Customer> getAllCustomers();
    public Customer addCustomer(Customer c);
    public Customer updateCustomer(Customer change);
    public boolean deleteCustomer(int id);
}
