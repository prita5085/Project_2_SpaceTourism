package com.revature.repositories;

import com.revature.models.Spaceport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceportRepo extends CrudRepository<Spaceport, Integer> {

    // extra methods if needed
}
