package com.revature.servicesTest;

import com.revature.models.Customer;
import com.revature.repositories.CustomerRepo;
import com.revature.services.CustomerService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = com.revature.Project2BackEnd.Project2BackEndApplication.class)
public class CustomerServiceTests {
    Customer c = new Customer(1, "Bob", "Dylan", "09082021", "dylan@net.com", "duser", "dpassword", "42", "Cass Lane", "Lake George", "CA", 92388, 909909);
    @Autowired
    CustomerService cs;

    @MockBean
    CustomerRepo cr;

    @Test
    void addCustomer(){
        Mockito.when(cr.save(c)).thenReturn(new Customer(1, "Bob", "Dylan", "09082021", "dylan@net.com", "duser", "dpassword", "42", "Cass Lane", "Lake George", "CA", 92388, 909909));
        c = cs.addCustomer(c);
        Assertions.assertEquals(1, c.getC_id());
        Assertions.assertEquals("Bob", c.getFirstName());
    }

    @Test
    void updateCustomer(){
        Mockito.when(cr.save(c)).thenReturn(new Customer(1, "Bob", "Dylan", "09082021", "dylan@net.com", "duser", "dpassword", "42", "Cass Lane", "Lake George", "CA", 92388, 909909));
        c = cs.updateCustomer(c);
        Assertions.assertEquals(1, c.getC_id());
        Assertions.assertEquals("Bob", c.getFirstName());

    }

    @Test
    void deleteCustomer(){
        Mockito.doNothing().when(cr).deleteById(c.getC_id());
        boolean result = cs.deleteCustomer(c.getC_id());
        Assertions.assertTrue(result);
    }

    @Test
    void getCustomer(){
        Optional<Customer> customer = Optional.of(c);
        Mockito.when(cr.findById(c.getC_id())).thenReturn(customer);
        Customer actual = cs.getCustomer(c.getC_id());
        Assertions.assertEquals(actual.getC_id(), c.getC_id());
    }

    @Test
    void getAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        customers.add(c);
        Mockito.when(cr.findAll()).thenReturn(customers);
        List<Customer> actual = cs.getAllCustomers();
        Assertions.assertNotNull(actual);
    }

}
