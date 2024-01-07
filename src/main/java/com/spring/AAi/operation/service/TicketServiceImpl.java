package com.spring.AAi.operation.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.spring.AAi.operation.binding.TicketBooked;
import com.spring.AAi.operation.binding.User;

@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer, TicketBooked> db = new HashMap<>();// Storing the data present in the server as we are not storing the data in dababase
	
	@Override
	public TicketBooked bookedTicket(User s) {
         TicketBooked t = new TicketBooked();
         Random r =new Random();
         int id=r.nextInt(5);
         t.setTNumber(id);
         t.setSmId(id);
         
         BeanUtils.copyProperties(s, t);
         t.setStatus("CONFIRMED");
         
         db.put(id, t);
         
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public Collection<TicketBooked> getAllTickets() {
		// TODO Auto-generated method stub
		return db.values();
	}

}
