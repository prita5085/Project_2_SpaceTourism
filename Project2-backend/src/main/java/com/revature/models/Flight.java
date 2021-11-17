package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f_id", updatable = false)
    private int id;

    @Column(name = "departure_date_time")
    private long departureDateTime;

    @Column(name = "arrival_date_time")
    private long arrivalDateTime;

    @Column(name = "price_per_ticket", columnDefinition = "numeric(8,2)")
    private double pricePerTicket;

    @Column(name = "v_cost", columnDefinition = "numeric(8,2)")
    private double vendorCost;

    @Column(name = "tickets_available")
    private int ticketsAvailable;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "departure_spaceport")
    private Spaceport departureSpaceport;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "arrival_spaceport")
    private Spaceport arrivalSpaceport;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "v_id")
    private Vendor vendor;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "ss_id")
    private Spaceship spaceship;

    public Flight() {

    }

    public Flight(int id, long departureDateTime, long arrivalDateTime, double pricePerTicket, double vendorCost, int ticketsAvailable, String status, Spaceport departureSpaceport, Spaceport arrivalSpaceport, Vendor vendor, Spaceship spaceship) {
        this.id = id;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.pricePerTicket = pricePerTicket;
        this.vendorCost = vendorCost;
        this.ticketsAvailable = ticketsAvailable;
        this.status = status;
        this.departureSpaceport = departureSpaceport;
        this.arrivalSpaceport = arrivalSpaceport;
        this.vendor = vendor;
        this.spaceship = spaceship;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(long departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public long getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(long arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public double getPricePerTicket() {
        return pricePerTicket;
    }

    public void setPricePerTicket(double pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public double getVendorCost() {
        return vendorCost;
    }

    public void setVendorCost(double vendorCost) {
        this.vendorCost = vendorCost;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Spaceport getDepartureSpaceport() {
        return departureSpaceport;
    }

    public void setDepartureSpaceport(Spaceport departureSpaceport) {
        this.departureSpaceport = departureSpaceport;
    }

    public Spaceport getArrivalSpaceport() {
        return arrivalSpaceport;
    }

    public void setArrivalSpaceport(Spaceport arrivalSpaceport) {
        this.arrivalSpaceport = arrivalSpaceport;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureDateTime=" + departureDateTime +
                ", arrivalDateTime=" + arrivalDateTime +
                ", pricePerTicket=" + pricePerTicket +
                ", vendorCost=" + vendorCost +
                ", ticketsAvailable=" + ticketsAvailable +
                ", status='" + status + '\'' +
                ", departureSpaceport=" + departureSpaceport +
                ", arrivalSpaceport=" + arrivalSpaceport +
                ", vendor=" + vendor +
                ", spaceship=" + spaceship +
                '}';
    }
}
