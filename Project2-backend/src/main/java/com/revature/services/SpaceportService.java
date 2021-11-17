package com.revature.services;

import com.revature.models.Spaceport;

import java.util.List;

public interface SpaceportService {

    // CRUD operations
    public Spaceport getSpaceport(int id);
    public List<Spaceport> getAllSpaceports();
    public Spaceport addSpaceport(Spaceport sp);
    public  Spaceport updateSpaceport(Spaceport change);
    public boolean deleteSpaceport(int id);

}
