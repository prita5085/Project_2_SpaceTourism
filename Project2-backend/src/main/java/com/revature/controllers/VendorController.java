package com.revature.controllers;

import com.revature.models.Vendor;
import com.revature.services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class VendorController {
    @Autowired
    VendorServices vs;

    @PostMapping(value = "/vendors", consumes = "application/json")
   public Vendor addVendor(@RequestBody Vendor v){
       return vs.addVendor(v);
   }

   @GetMapping("/vendors/{id}")
   public Vendor getVendor (@PathVariable("id") String id){
        return vs.getVendor(Integer.parseInt(id));
   }

   @GetMapping("/vendors")
   public List<Vendor> getAllVendors(){return vs.getAllVendors();}

    @PutMapping("/vendors/{id}")
    public Vendor updateVendor(@PathVariable("id") String id, @RequestBody Vendor change){
        change.setVendor_id(Integer.parseInt(id));
        return vs.updateVendor(change);
    }

    @DeleteMapping("/vendors/{id}")
    public boolean deleteVendor(@PathVariable("id") String id){
        return vs.deleteVendor(Integer.parseInt(id));
    }




}
