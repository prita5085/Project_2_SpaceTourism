package com.revature.services;

import com.revature.models.Spaceport;
import com.revature.repositories.SpaceportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceportServiceImpl implements SpaceportService{

    @Autowired
    SpaceportRepo spr;

    @Override
    public Spaceport getSpaceport(int id) {
        return spr.findById(id).get();
    }

    @Override
    public List<Spaceport> getAllSpaceports() {
        return (List<Spaceport>) spr.findAll();
    }

    @Override
    public Spaceport addSpaceport(Spaceport sp) {
        return spr.save(sp);
    }

    @Override
    public Spaceport updateSpaceport(Spaceport change) {
        return spr.save(change);
    }

    @Override
    public boolean deleteSpaceport(int id) {
        try {
            spr.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
