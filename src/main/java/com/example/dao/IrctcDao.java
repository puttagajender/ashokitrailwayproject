package com.example.dao;

import java.util.HashMap;
import java.util.Map;
//import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

//import com.example.request.PassengerRequest;
import com.example.response.TicketResponse;

@Repository

public class IrctcDao {

	private Map<String, TicketResponse> ticketsMap = new HashMap<>();

	public String saveTicket(TicketResponse response) {
		ticketsMap.put(response.getPnr(), response);
		return response.getPnr();
	}

	public TicketResponse getTicketByPnr(String pnr) {
		if (ticketsMap.containsKey(pnr)) {
			return ticketsMap.get(pnr);
		}
		return null;
	}

	public String updateTicket(TicketResponse response) {
		String pnr = response.getPnr();
		ticketsMap.put(pnr, response);
		return "updated";
	}
	public String deleteTicket(TicketResponse response) {
		String pnr = response.getPnr();
		ticketsMap.put(pnr, response);
		return "deleted";
	} //or deleteTicket
	public String deleteTicket(String pnr) {
		ticketsMap.remove(pnr);
		return "succesfully deleted";
	}
}
