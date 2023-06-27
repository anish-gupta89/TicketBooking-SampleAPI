package com.ag.rest.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rest.pojo.PsngrRqst;
import com.ag.rest.pojo.TicketResponse;

@RestController
public class TicketBookingRestController {

	@GetMapping(value = "/ticket", produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE})
	public TicketResponse getData(@RequestParam(name = "id",required = false) String bookingId) {
	System.out.println("Ticke Id"+bookingId);
		if(bookingId == null) {
			return null;
		}
		TicketResponse req =  new TicketResponse();
		req.setTicketId("1");
		req.setfName("Anish");
		req.setlName("Gupta");
		req.setAddress("Indore");
		return req;
	}
	
	@PostMapping(value = "/bookticket", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PsngrRqst request) {
		System.out.println(request);
		if (request != null) {
			TicketResponse response = new TicketResponse();
			response.setTicketStatus("BOOKED");
			response.setTicketId(UUID.randomUUID().toString());
			response.setBookingAmount(2500.00);
			BeanUtils.copyProperties(request, response);
			return new ResponseEntity<TicketResponse>(response, HttpStatus.CREATED);
		} else {
			TicketResponse r = new TicketResponse();
			r = null;
			return new ResponseEntity<TicketResponse>(r, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping(value = "/updatebooking", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<TicketResponse> updatePessangerDetails(@RequestBody TicketResponse req) {
		System.out.println(req);
		if(req == null) {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		}
		TicketResponse response = req;
		if(response.getDoj() != null) {
			response.setDoj(LocalDate.now().toString());	
		}
		return new ResponseEntity<TicketResponse>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteticket/{ticketid}")
	public String deleteTicket(@PathVariable(name = "ticketid") Integer id) {
		System.out.println("Ticket Id is"+id);
		if(id != null) {
		 return "Ticket Deleted";	
		}
		return null;
		
	}
}
