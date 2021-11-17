package com.revature.servicesTest;

import com.revature.models.Spaceport;
import com.revature.models.Spaceship;
import com.revature.repositories.SpaceportRepo;
import com.revature.services.SpaceportService;
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
public class SpaceportServiceTests {
    @Autowired
    SpaceportService ss;

    @MockBean
    SpaceportRepo sr;

    Spaceport s = new Spaceport(1, "Trantor", "Moon");

    @Test
    void addSpaceport(){
        Mockito.when(sr.save(s)).thenReturn(new Spaceport(1, "Trantor", "Moon"));
        s = ss.addSpaceport(s);

        Assertions.assertEquals(1, s.getSpID());
        Assertions.assertEquals("Moon", s.getPlanet());


    }
    @Test
    void updateSpaceport(){
        Mockito.when(sr.save(s)).thenReturn(new Spaceport(1, "Trantor", "Moon"));
        s = ss.updateSpaceport(s);

        Assertions.assertEquals(1, s.getSpID());
        Assertions.assertEquals("Moon", s.getPlanet());
    }
    @Test
    void deleteSpaceport(){
        Mockito.doNothing().when(sr).deleteById(s.getSpID());
        boolean result = ss.deleteSpaceport(s.getSpID());
        Assertions.assertTrue(result);
    }
    @Test
    void getSpaceport(){
        Optional<Spaceport> spaceportOptional = Optional.of(s);
        Mockito.when(sr.findById(s.getSpID())).thenReturn(spaceportOptional);
        Spaceport actual = ss.getSpaceport(s.getSpID());
        Assertions.assertEquals(actual.getSpID(), s.getSpID());

    }

    @Test
    void getAllSpaceships(){
        List<Spaceport> spaceports = new ArrayList<>();
        spaceports.add(s);
        Mockito.when(sr.findAll()).thenReturn(spaceports);
        List<Spaceport> actual = ss.getAllSpaceports();
        Assertions.assertNotNull(actual);

    }
}
