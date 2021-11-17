package com.revature.servicesTest;

import com.revature.models.Spaceship;
import com.revature.repositories.SpaceshipRepo;
import com.revature.services.SpaceshipService;
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
public class SpaceshipServiceTests {
    @Autowired
    SpaceshipService ss;

    @MockBean
    SpaceshipRepo sr;

    Spaceship s = new Spaceship(1,"long haul", "buzz", 34);

    @Test
    void addSpaceship(){
        Mockito.when(sr.save(s)).thenReturn(new Spaceship(1,"long haul", "buzz", 34));
        s = ss.addSpaceship(s);

        Assertions.assertEquals(1, s.getSsID());
        Assertions.assertEquals(34, s.getNumSeats());


    }
    @Test
    void updateSpaceship(){
        Mockito.when(sr.save(s)).thenReturn(new Spaceship(1,"long haul", "buzz", 34));
        s = ss.updateSpaceship(s);

        Assertions.assertEquals(1, s.getSsID());
        Assertions.assertEquals(34, s.getNumSeats());
    }
    @Test
    void deleteSpaceship(){
        Mockito.doNothing().when(sr).deleteById(s.getSsID());
        boolean result = ss.deleteSpaceship(s.getSsID());
        Assertions.assertTrue(result);
    }
    @Test
    void getSpaceship(){
        Optional<Spaceship> spaceshipOptional = Optional.of(s);
        Mockito.when(sr.findById(s.getSsID())).thenReturn(spaceshipOptional);
        Spaceship actual = ss.getSpaceship(s.getSsID());
        Assertions.assertEquals(actual.getSsID(), s.getSsID());

    }

    @Test
    void getAllSpaceships(){
        List<Spaceship> spaceships = new ArrayList<>();
        spaceships.add(s);
        Mockito.when(sr.findAll()).thenReturn(spaceships);
        List<Spaceship> actual = ss.getAllSpaceships();
        Assertions.assertNotNull(actual);

    }
}
