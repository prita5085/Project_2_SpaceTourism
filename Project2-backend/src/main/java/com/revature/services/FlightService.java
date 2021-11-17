package com.revature.services;

import com.revature.models.Flight;
import com.revature.util.FindFlights;

import java.util.List;

public interface FlightService {

    public Flight getFlight(int id);
    public List<Flight> getAllFlights();
    public Flight addFlight(Flight f);
    public Flight updateFlight(Flight change);
    public boolean deleteFlight(int id);
    List<Flight> findByDestinationsAndDate(FindFlights findFlights);


}
