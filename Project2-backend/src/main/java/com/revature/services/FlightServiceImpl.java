package com.revature.services;

import com.revature.models.Flight;
import com.revature.repositories.FlightRepo;
import com.revature.util.FindFlights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    //Automatically maps an object to its instance found in Spring Container.
    //If one exists.
    //If more than one exists, need a @Qualifier
    @Autowired //Field Injection
    FlightRepo fr;

    //Crud Services
    @Override
    public Flight getFlight(int id) {
        return fr.findById(id).get();
    }

    @Override
    public List<Flight> getAllFlights() {
        return (List<Flight>) fr.findAll();
    }

    @Override
    public Flight addFlight(Flight f) {
        return fr.save(f);
    }

    @Override
    public Flight updateFlight(Flight change) {
        return fr.save(change);
    }

    @Override
    public boolean deleteFlight(int id) {

        try{
            fr.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Additional Services below as needed
    //Filtering flights based on user's input (Dept/Arrival:To/From/Date/Time/Destinations)
    @Override
	public List<Flight> findByDestinationsAndDate(FindFlights findFlights) {
		
		long departureDate = findFlights.getDepartureDate();
		long arrivalDate = findFlights.getArrivalDate();
		String departureSpaceport = findFlights.getDepartureSpaceport();
		String arrivalSpaceport = findFlights.getArrivalSpaceport();
		List<Flight> filteredFlights = new ArrayList<Flight>();
		try {
			List<Flight> allFlights = this.getAllFlights();
            for(Flight ob : allFlights) {
            	if(ob.getDepartureDateTime()==departureDate 
            			&& ob.getArrivalDateTime()==arrivalDate 
            			&& ob.getDepartureSpaceport().getSpName().equals(departureSpaceport)
            			&& ob.getArrivalSpaceport().getSpName().equals(arrivalSpaceport)) {
            		filteredFlights.add(ob);
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No flights found for this destination and/or date");
	}
		return filteredFlights;
	}	
}
