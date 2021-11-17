package com.revature.repositories;

import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

import com.revature.models.Ticket;

@Repository
public interface TicketRepo extends CrudRepository<Ticket, Integer>{

}
