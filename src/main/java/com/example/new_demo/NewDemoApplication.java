package com.example.new_demo;

import com.example.new_demo.dto.FlightBookingAcknowledgement;
import com.example.new_demo.dto.FlightBookingRequest;
import com.example.new_demo.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewDemoApplication {

	@Autowired
	private FlightBookingService service;


	@PostMapping("bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
	return service.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(NewDemoApplication.class, args);
	}

}
