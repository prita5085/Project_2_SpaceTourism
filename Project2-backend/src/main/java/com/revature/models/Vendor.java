package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "v_id")
    private int vendor_id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "v_username", nullable = false)
    private String vendorUsername;

    @Column(name = "v_password")
    private String vendorPassword;

    private String email;

    @Column(name = "phone_number", columnDefinition="numeric(10,0)")
    private double phoneNumber;

    private String slogan;

    public Vendor() {
    }

    public Vendor(int vendor_id, String companyName, String vendorUsername, String vendorPassword, String email, double phoneNumber, String slogan) {
        this.vendor_id = vendor_id;
        this.companyName = companyName;
        this.vendorUsername = vendorUsername;
        this.vendorPassword = vendorPassword;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slogan = slogan;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVendorUsername() {
        return vendorUsername;
    }

    public void setVendorUsername(String vendorUsername) {
        this.vendorUsername = vendorUsername;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendor_id=" + vendor_id +
                ", companyName='" + companyName + '\'' +
                ", vendorUsername='" + vendorUsername + '\'' +
                ", vendorPassword='" + vendorPassword + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
