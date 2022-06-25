package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.dao.IrctcDao;
import com.example.request.PassengerRequest;
import com.example.response.TicketResponse;


@Service
//@Configurable
public class IrctcService {
	
	@Autowired
	private IrctcDao dao;
	
	public String bookTicket(PassengerRequest request) {
		// logic should be her to book ticket
		TicketResponse response = new TicketResponse();
		response.setTicketId(123456);
		response.setName(request.getName());
		
		response.setStatus("confirmed");
		response.setCost(5500.66);
		// response.setTicketId(123456);
		response.setFrom(request.getFrom());
		response.setTo(request.getTo());
		response.setJourneyDate(request.getJourneyDate());
		//String pnr = UUID.randomUUID().toString();
		response.setPnr("pnr2343444");
		//response.setPnr(pnr);
        dao.saveTicket(response);
		System.out.println("gvdgd");
		return "pnr2343444";
	}

	public TicketResponse getTicketByPnr(String pnr) {
		return dao.getTicketByPnr(pnr); } 

    public String updateTicket(TicketResponse ticket) {
          return dao.updateTicket(ticket);	
    }
    public String deleteTicket(TicketResponse response){
    	return dao.deleteTicket(response);
    }//or for deleteTicket
   public String deleteTicket(String pnr) {
    	return dao.deleteTicket(pnr);
    	
    }
    }





















