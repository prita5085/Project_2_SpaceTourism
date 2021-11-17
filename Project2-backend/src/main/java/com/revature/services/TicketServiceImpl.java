package com.revature.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Ticket;
import com.revature.repositories.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepo tr;
	

	@Override
	public Ticket addTicket(Ticket ticket) {
		return tr.save(ticket);
	}

	@Override
	public List<Ticket> getAllTickets() {
		return (List<Ticket>) tr.findAll();
	}

	@Override
	public Ticket getTicket(int id) {
		return tr.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return tr.save(ticket);
	}

	@Override
	public boolean deleteTicket(int id) {
		try{
		       tr.deleteById(id);
		       return true;
		   } catch (IllegalArgumentException e) {
		       e.printStackTrace();
		       return false;
		   }
	}
	
}

