package com.revature.repositories;

import com.revature.models.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends CrudRepository<Vendor, Integer> {

}
