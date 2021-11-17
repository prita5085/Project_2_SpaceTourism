
package com.revature.controllers;

import com.revature.models.Flight;
import com.revature.services.FlightService;
import com.revature.util.FindFlights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class FlightController {

    @Autowired
    FlightService fs;


    //Crud Controllers

    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable("id") String id) {
        return fs.getFlight(Integer.parseInt(id));
    }

    @GetMapping("/flight")
    public List<Flight> getAllFlights() {
        return fs.getAllFlights();
    }

    @PostMapping(value = "/flight", consumes = "application/json", produces = "application/json")
    public Flight addFlight(@RequestBody Flight f) {
        return fs.addFlight(f);
    }

    @PutMapping(value = "/flight/{id}", consumes = "application/json", produces = "application/json")
    public Flight updateFlight(@PathVariable("id") String id, @RequestBody Flight change) {
        change.setId(Integer.parseInt(id));
        return fs.updateFlight(change);
    }

    @DeleteMapping("/flight/{id}")
    public boolean deleteFlight(@PathVariable("id") int id) {
        return fs.deleteFlight(id);
    }


    //Additional Controllers below as needed

    // Filters all flights to only return the flights in the future for this particular vendor
    @GetMapping("/futureFlights/{id}")
    public List<Flight> getAllFutureFlights(@PathVariable("id") int id) {
        List<Flight> futureFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlights();

        for(Flight flight : allFlights) {
            if (!flight.getStatus().equalsIgnoreCase("Complete") && !flight.getStatus().equalsIgnoreCase("Cancelled")) {
                if(flight.getVendor().getVendor_id() == id){
                    futureFlights.add(flight);
                }

            }
        }

        return futureFlights;
    }

    // Filters all flights to only return the flights in the past for this particular vendor
    @GetMapping("/pastFlights/{id}")
    public List<Flight> getAllPastFlights(@PathVariable("id") int id) {
        List<Flight> pastFlights = new ArrayList<Flight>();
        List<Flight> allFlights = getAllFlights();

        for(Flight flight : allFlights) {
            if (flight.getStatus().equalsIgnoreCase("Complete") || flight.getStatus().equalsIgnoreCase("Cancelled")) {
                if(flight.getVendor().getVendor_id() == id) {
                    pastFlights.add(flight);
                }
            }
        }

        return pastFlights;
    }

   //Filtered Flights to fetch all flights based on user's input (Dept/Arrival : Date/Time/Destinations)
    @PostMapping(value = "/flight/findFlights", consumes = "application/json", produces = "application/json")
    public List<Flight> findByDestinationsAndDate(@RequestBody FindFlights ff){
    	return fs.findByDestinationsAndDate(ff);
    }

}

