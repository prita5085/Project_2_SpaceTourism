package com.revature.controllers;

import com.revature.models.Spaceport;
import com.revature.services.SpaceportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SpaceportController {

    @Autowired
    SpaceportService sps;

    // CRUD Controllers
    @PostMapping(value = "/spaceports", consumes = "application/json")
    public Spaceport addSpaceport(@RequestBody Spaceport sp) {
        return sps.addSpaceport(sp);
    }

    @GetMapping("/spaceports/{id}")
    public Spaceport getSpaceport(@PathVariable("id") String id) {
        return sps.getSpaceport(Integer.parseInt(id));
    }

    @GetMapping("/spaceports")
    public List<Spaceport> getAllSpaceports() {
        return sps.getAllSpaceports();
    }

    @PutMapping("/spaceports/{id}")
    public Spaceport updateSpaceport(@PathVariable("id") String id, @RequestBody Spaceport change) {
        change.setSpID(Integer.parseInt(id));
        return sps.updateSpaceport(change);
    }

    @DeleteMapping("/spaceports/{id}")
    public boolean deleteSpaceport(@PathVariable("id") String id) {
        return sps.deleteSpaceport(Integer.parseInt(id));
    }
}
