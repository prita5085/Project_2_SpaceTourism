package com.revature.servicesTest;

import com.revature.models.Flight;
import com.revature.models.Spaceport;
import com.revature.models.Spaceship;
import com.revature.models.Vendor;
import com.revature.repositories.FlightRepo;
import com.revature.services.FlightService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = com.revature.Project2BackEnd.Project2BackEndApplication.class)
public class FlightServiceTest {
    @Autowired
    FlightService fs;

    @MockBean
    FlightRepo fr;

    Spaceport spaceport = new Spaceport(1, "Trantor", "Moon");
    Spaceship spaceship = new Spaceship(1,"long haul", "buzz", 34);
    Vendor v = new Vendor(1,"Galatic", "gtic", "gpassword", "g@gmail.com", 9090, "Hey Everyone");
    Flight f = new Flight(1,80,80,70,40,32,"preflight", spaceport, spaceport, v, spaceship);

    @Test
    void addFlight(){
        Mockito.when(fr.save(f)).thenReturn(new Flight(1,80,80,70,40,32,"preflight", spaceport, spaceport, v, spaceship));
        f = fs.addFlight(f);
        Assertions.assertEquals(1, f.getId());
        Assertions.assertEquals("preflight", f.getStatus());
    }
    @Test
    void updateFlight(){
        Mockito.when(fr.save(f)).thenReturn(new Flight(1,80,80,70,40,32,"preflight", spaceport, spaceport, v, spaceship));
        f = fs.updateFlight(f);
        Assertions.assertEquals(1, f.getId());
        Assertions.assertEquals("preflight", f.getStatus());
    }
    @Test
    void deleteFlight(){
        Mockito.doNothing().when(fr).deleteById(f.getId());
        boolean result = fs.deleteFlight(f.getId());
        Assertions.assertTrue(result);
    }
    @Test
    void getFlights(){
        Optional<Flight> flightOptional = Optional.of(f);
        Mockito.when(fr.findById(f.getId())).thenReturn(flightOptional);
        Flight actual = fs.getFlight(f.getId());
        Assertions.assertEquals(actual.getId(), f.getId());
    }
    @Test
    void getAllFlights(){
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(f);
        Mockito.when(fr.findAll()).thenReturn(flights);
        List<Flight> actual = fs.getAllFlights();

        Assertions.assertNotNull(actual);
    }
}
