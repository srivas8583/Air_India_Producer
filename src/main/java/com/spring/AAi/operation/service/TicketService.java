package com.spring.AAi.operation.service;

import java.util.Collection;



import com.spring.AAi.operation.binding.TicketBooked;
import com.spring.AAi.operation.binding.User;


public interface TicketService {

	   public TicketBooked bookedTicket(User s);
	   
	   public Collection<TicketBooked>getAllTickets();
	
}
