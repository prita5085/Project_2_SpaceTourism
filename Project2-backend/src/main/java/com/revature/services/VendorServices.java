package com.revature.services;

import com.revature.models.Vendor;

import java.util.List;

public interface VendorServices {
    public Vendor addVendor (Vendor v);
    public Vendor getVendor ( int id);
    public List<Vendor> getAllVendors();
    public Vendor updateVendor(Vendor change);
    public boolean deleteVendor ( int id);

}
