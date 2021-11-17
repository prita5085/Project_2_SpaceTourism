package com.revature.services;

import com.revature.models.Vendor;
import com.revature.repositories.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServicesImpl implements VendorServices {

    @Autowired
    VendorRepo vr;

    @Override
    public Vendor addVendor(Vendor v) {
        return vr.save(v);
    }

    @Override
    public Vendor getVendor(int id) {
        return vr.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return (List<Vendor>)vr.findAll();
    }

    @Override
    public Vendor updateVendor(Vendor change) {
        return vr.save(change);
    }

    @Override
    public boolean deleteVendor(int id) {
       try{
           vr.deleteById(id);
           return true;
       }catch(IllegalArgumentException e){
           e.printStackTrace();
           return false;
        }
    }
}
