package com.revature.repositories;

import com.revature.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepo extends CrudRepository<Spaceship, Integer> {

    // extra methods if needed
}
