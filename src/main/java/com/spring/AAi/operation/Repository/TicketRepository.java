package com.spring.AAi.operation.Repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.AAi.operation.binding.TicketBooked;
import com.spring.AAi.operation.binding.User;
import com.spring.AAi.operation.service.TicketService;

@Repository
@RestController
public class TicketRepository {
    @Autowired
	private TicketService  ticketService;
    @PostMapping("/AaiTicket")
    public ResponseEntity<TicketBooked> bookTicket (@RequestBody User s){
    	  TicketBooked ticketBooked = ticketService.bookedTicket(s);
    	  return new ResponseEntity<>(ticketBooked, HttpStatus.CREATED);
    }
    
    @GetMapping("/AaiListOfTickets")
    public ResponseEntity<Collection<TicketBooked>> getTickets(){
    	Collection<TicketBooked> allTickets = ticketService.getAllTickets();
    	return new ResponseEntity<>(allTickets , HttpStatus.OK);
    }
}
