package com.revature.controllers;

import com.revature.models.Spaceship;
import com.revature.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SpaceshipController {

    @Autowired
    SpaceshipService sss;

    // CRUD Controllers
    @PostMapping(value = "/spaceships", consumes = "application/json")
    public Spaceship addSpaceship(@RequestBody Spaceship sp) {
        return sss.addSpaceship(sp);
    }

    @GetMapping("/spaceships/{id}")
    public Spaceship getSpaceship(@PathVariable("id") String id) {
        return sss.getSpaceship(Integer.parseInt(id));
    }

    @GetMapping("/spaceships")
    public List<Spaceship> getAllSpaceships() {
        return sss.getAllSpaceships();
    }

    @PutMapping("/spaceships/{id}")
    public Spaceship updateSpaceship(@PathVariable("id") String id, @RequestBody Spaceship change) {
        change.setSsID(Integer.parseInt(id));
        return sss.updateSpaceship(change);
    }

    @DeleteMapping("/spaceships/{id}")
    public boolean deleteSpaceship(@PathVariable("id") String id) {
        return sss.deleteSpaceship(Integer.parseInt(id));
    }

}
