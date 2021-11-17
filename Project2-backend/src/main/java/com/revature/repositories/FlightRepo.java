package com.revature.repositories;

import com.revature.models.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // basic crud operations taken care of by this annotation
public interface FlightRepo extends CrudRepository<Flight, Integer> {

    //More will go here if needed
//    List<Flight> findByDepartureDateTime(long departureDateTime);
//    List<Flight> findByArrivalDateTime(long arrivalDateTime);


}
