package com.revature.services;

import com.revature.models.Spaceship;

import java.util.List;

public interface SpaceshipService {

    // CRUD operations
    public Spaceship getSpaceship(int id);
    public List<Spaceship> getAllSpaceships();
    public Spaceship addSpaceship(Spaceship ss);
    public  Spaceship updateSpaceship(Spaceship change);
    public boolean deleteSpaceship(int id);

}
