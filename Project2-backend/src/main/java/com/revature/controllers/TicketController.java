package com.revature.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revature.models.Ticket;
import com.revature.services.TicketService;

@CrossOrigin
@RestController
public class TicketController {

	    @Autowired
	    TicketService ts;
	    
	    @PostMapping(value = "/tickets", consumes = "application/json", produces = "application/json")
	    public Ticket addTicket(@RequestBody Ticket ticket) {
	        return ts.addTicket(ticket);
	    }

	    @GetMapping("/tickets")
	    public List<Ticket> getAllTickets() {
	        System.out.println("Getting All Tickets");
	        return ts.getAllTickets();
	    }

	    @GetMapping("/tickets/{id}")
	    public Ticket getTicket(@PathVariable("id") String id) {
	        return ts.getTicket(Integer.parseInt(id));
	    }

	    @PutMapping(value = "tickets/{id}", consumes = "application/json", produces = "application/json")
	    public Ticket updateTicket(@PathVariable("id") String id, @RequestBody Ticket ticket) {
	        ticket.setTicketId(Integer.parseInt(id));
	        return ts.updateTicket(ticket);
	    }

	    @DeleteMapping("tickets/{id}")
	    public boolean deleteTicket(@PathVariable("id") int id) {
	        System.out.println("Deleting Ticket");
	        return ts.deleteTicket(id);
	    }


}
