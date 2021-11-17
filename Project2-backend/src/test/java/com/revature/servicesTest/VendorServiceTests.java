package com.revature.servicesTest;

import com.revature.models.Vendor;
import com.revature.repositories.VendorRepo;
import com.revature.services.VendorServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = com.revature.Project2BackEnd.Project2BackEndApplication.class)
public class VendorServiceTests {
    @Autowired
    VendorServices vs;

    @MockBean
    VendorRepo vr;

    Vendor v = new Vendor(0,"Galatic", "gtic", "gpassword", "g@gmail.com", 9090, "Hey Everyone");

    @Test
    void addVendor(){
        Mockito.when(vr.save(v)).thenReturn(new Vendor(1, v.getCompanyName(), v.getVendorUsername(), v.getVendorPassword(), v.getEmail(), v.getPhoneNumber(), v.getSlogan()));
        v = vs.addVendor(v);

        Assertions.assertEquals(1, v.getVendor_id());
        Assertions.assertEquals("gtic", v.getVendorUsername());

    }
    @Test
    void updateVendor(){
        Mockito.when(vr.save(v)).thenReturn(new Vendor(1, v.getCompanyName(), v.getVendorUsername(), v.getVendorPassword(), v.getEmail(), v.getPhoneNumber(), v.getSlogan()));
        v = vs.updateVendor(v);

        Assertions.assertEquals(1, v.getVendor_id());
        Assertions.assertEquals("gtic", v.getVendorUsername());
    }

    @Test
    void getVendor(){
        Mockito.when(vr.findById(v.getVendor_id())).thenReturn(java.util.Optional.of(new Vendor(0, v.getCompanyName(), v.getVendorUsername(), v.getVendorPassword(), v.getEmail(), v.getPhoneNumber(), v.getSlogan())));

        Vendor actual = vs.getVendor(v.getVendor_id());
        Assertions.assertEquals(actual.getVendor_id(), v.getVendor_id());
    }
    @Test
    void getAllVendor(){
        List<Vendor> vendorList = new ArrayList<Vendor>();
        List<Vendor> vendor2;
        vendorList.add(v);
        Mockito.when(vr.findAll()).thenReturn(vendorList);
        vendor2 = vs.getAllVendors();

        Assertions.assertNotNull(vendor2);


    }

    @Test
    void deleteVendor(){
        Mockito.doNothing().when(vr).deleteById(v.getVendor_id());
        boolean result = vs.deleteVendor(v.getVendor_id());
        Assertions.assertTrue(result);
    }
}
