package com.revature.servicesTest;

import com.revature.models.*;
import com.revature.repositories.TicketRepo;
import com.revature.services.TicketService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = com.revature.Project2BackEnd.Project2BackEndApplication.class)
public class TicketServiceTests {
    @Autowired
    TicketService ts;

    @MockBean
    TicketRepo tr;

    Spaceport spaceport = new Spaceport(1, "Trantor", "Moon");
    Spaceship spaceship = new Spaceship(1,"long haul", "buzz", 34);
    Vendor v = new Vendor(1,"Galatic", "gtic", "gpassword", "g@gmail.com", 9090, "Hey Everyone");
    Flight f = new Flight(1,80,80,70,40,32,"preflight", spaceport, spaceport, v, spaceship);
    Customer c = new Customer(1, "Bob", "Dylan", "09082021", "dylan@net.com", "duser", "dpassword", "42", "Cass Lane", "Lake George", "CA", 92388, 909909);
    Ticket t = new Ticket(1, c, 90909, "90902022", 1, 2, "low fat", "economy", f);

    @Test
    void addTicket(){
        Mockito.when(tr.save(t)).thenReturn(new Ticket(1, c, 90909, "90902022", 1, 2, "low fat", "economy", f));
        t = ts.addTicket(t);
        Assertions.assertEquals(1, t.getTicketId());
        Assertions.assertEquals(1, t.getCheckedBag());
    }
    @Test
    void updateTicket(){
        Mockito.when(tr.save(t)).thenReturn(new Ticket(1, c, 90909, "90902022", 1, 2, "low fat", "economy", f));
        t = ts.updateTicket(t);
        Assertions.assertEquals(1, t.getTicketId());
        Assertions.assertEquals(1, t.getCheckedBag());
    }
    @Test
    void deleteTicket(){
        Mockito.doNothing().when(tr).deleteById(t.getTicketId());
        boolean result = ts.deleteTicket(t.getTicketId());
        Assertions.assertTrue(result);
    }
    @Test
    void getTicket(){
        Optional<Ticket> ticketOptional = Optional.of(t);
        Mockito.when(tr.findById(t.getTicketId())).thenReturn(ticketOptional);
        Ticket actual = ts.getTicket(t.getTicketId());
        Assertions.assertEquals(actual.getTicketId(), t.getTicketId());
        Assertions.assertEquals(actual.getCabinClass(), t.getCabinClass());
    }
    @Test
    void getAllTickets(){
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(t);
        Mockito.when(tr.findAll()).thenReturn(tickets);
        List<Ticket> actual = ts.getAllTickets();

        Assertions.assertNotNull(actual);

    }




}
