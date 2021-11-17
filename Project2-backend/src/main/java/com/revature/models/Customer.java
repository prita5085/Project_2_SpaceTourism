package com.revature.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id", updatable = false)
    private int c_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private String dob;

    @Column(name = "email")
    private String email;

    @Column(name = "c_username")
    private String cUsername;

    @Column(name = "c_password")
    private String cPassword;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode", columnDefinition = "int")
    private int zipcode;

    @Column(name = "phone_number", columnDefinition = "numeric(10,0)")
    private double phoneNumber;


    public Customer() {
    }

    public Customer(String firstName, String lastName, String dob, String email, String cUsername, String cPassword, String addressLine1, String addressLine2, String city, String state, int zipcode, double phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.cUsername = cUsername;
        this.cPassword = cPassword;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }

    public Customer(int c_id, String firstName, String lastName, String dob, String email, String cUsername, String cPassword, String addressLine1, String addressLine2, String city, String state, int zipcode, double phoneNumber) {
        this.c_id = c_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.cUsername = cUsername;
        this.cPassword = cPassword;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }


    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return c_id == customer.c_id && zipcode == customer.zipcode && phoneNumber == customer.phoneNumber && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(dob, customer.dob) && Objects.equals(email, customer.email) && Objects.equals(cUsername, customer.cUsername) && Objects.equals(cPassword, customer.cPassword) && Objects.equals(addressLine1, customer.addressLine1) && Objects.equals(addressLine2, customer.addressLine2) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_id, firstName, lastName, dob, email, cUsername, cPassword, addressLine1, addressLine2, city, state, zipcode, phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_id=" + c_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", cUsername='" + cUsername + '\'' +
                ", cPassword='" + cPassword + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
