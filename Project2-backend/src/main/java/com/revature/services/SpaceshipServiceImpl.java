package com.revature.services;

import com.revature.models.Spaceship;
import com.revature.repositories.SpaceshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SpaceshipServiceImpl implements SpaceshipService{

    @Autowired
    SpaceshipRepo ssr;

    @Override
    public Spaceship getSpaceship(int id) {
        return ssr.findById(id).get();
    }

    @Override
    public List<Spaceship> getAllSpaceships() {
        return  (List<Spaceship>) ssr.findAll();
    }

    @Override
    public Spaceship addSpaceship(Spaceship ss) {
        return ssr.save(ss);
    }

    @Override
    public Spaceship updateSpaceship(Spaceship change) {
        return ssr.save(change);
    }

    @Override
    public boolean deleteSpaceship(int id) {
        try {
            ssr.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
