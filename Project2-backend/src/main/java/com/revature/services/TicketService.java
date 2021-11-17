package com.revature.services;

import java.util.List; 

import com.revature.models.Ticket;

public interface TicketService {
	
	public Ticket addTicket(Ticket ticket);
	public List<Ticket> getAllTickets();
	public Ticket getTicket(int id);
    public Ticket updateTicket(Ticket ticket);
    public boolean deleteTicket(int id);
}
