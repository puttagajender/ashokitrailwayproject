package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassengerRequest;
import com.example.response.TicketResponse;
import com.example.service.IrctcService;

    @RestController
    public class IrctcController {
    @Autowired
	private IrctcService service;

	@PostMapping(value = "/bookticket",
			consumes = {"application/xml", "application/json"})

	public ResponseEntity<String> bookTicket(@RequestBody PassengerRequest request) {

    String pnr = service.bookTicket(request);

	String msg = "ticket confirmed" + pnr;

	return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

	@GetMapping("/getticket/{pnr}")
    
    public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr){
    	
    TicketResponse ticket = 	service.getTicketByPnr(pnr);
   
	return new ResponseEntity<>(ticket,HttpStatus.OK);
    }
	@PutMapping(value ="/update")
	public ResponseEntity<String> updateTicket(@RequestBody TicketResponse ticket){
		String pnr = service.updateTicket(ticket);
		return new ResponseEntity<>(pnr, HttpStatus.OK);
	}
    @DeleteMapping(value ="/delete/{pnr}")
    public ResponseEntity<String> deletTicket(@PathVariable String pnr) {
    String msg =	"wmm"+service.deleteTicket(pnr);
    return new ResponseEntity<>(msg,HttpStatus.OK);
    }

    }
