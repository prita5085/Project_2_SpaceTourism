package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id", updatable = false)
	private int ticketId;

	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer cID;
	
	@Column(name = "passport_no", columnDefinition = "numeric(9,0)")
	private int passportNo;
	
	@Column(name = "expiry_date")
	private String expiryDate;
	
	@Column(name = "checked_bag")
	private int checkedBag;
	
	@Column(name = "carry_on_bag")
	private int carryOnBag;
	
	@Column(name = "meal")
	private String meal;
	
	@Column(name = "cabin_class")
	private String cabinClass;
	
	@ManyToOne
	@JoinColumn(name = "f_id")
	private Flight flight;
	
	
	public Ticket() {
		super();
	}


	public Ticket(int ticketId, Customer cID, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal, String cabinClass, Flight flight) {
		this.ticketId = ticketId;
		this.cID = cID;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}

	public Ticket(int ticketId, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
				  String cabinClass, Flight flight) {
		super();
		this.ticketId = ticketId;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}
	
	public Ticket(int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass, Flight flight) {
		super();
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}


	public Ticket(int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal, String cabinClass) {
		super();
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
	}
	

	public Ticket(Customer cID, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass, Flight flight) {
		super();
		this.cID = cID;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}


	public Customer getcID() {
		return cID;
	}

	public void setcID(Customer cID) {
		this.cID = cID;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCheckedBag() {
		return checkedBag;
	}

	public void setCheckedBag(int checkedBag) {
		this.checkedBag = checkedBag;
	}

	public int getCarryOnBag() {
		return carryOnBag;
	}

	public void setCarryOnBag(int carryOnBag) {
		this.carryOnBag = carryOnBag;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Ticket{" +
				"ticketId=" + ticketId +
				", cID=" + cID +
				", passportNo=" + passportNo +
				", expiryDate='" + expiryDate + '\'' +
				", checkedBag=" + checkedBag +
				", carryOnBag=" + carryOnBag +
				", meal='" + meal + '\'' +
				", cabinClass='" + cabinClass + '\'' +
				", flight=" + flight +
				'}';
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ticket ticket = (Ticket) o;
		return getTicketId() == ticket.getTicketId() && getPassportNo() == ticket.getPassportNo() && getCheckedBag() == ticket.getCheckedBag() && getCarryOnBag() == ticket.getCarryOnBag() && Objects.equals(getcID(), ticket.getcID()) && Objects.equals(getExpiryDate(), ticket.getExpiryDate()) && Objects.equals(getMeal(), ticket.getMeal()) && Objects.equals(getCabinClass(), ticket.getCabinClass()) && Objects.equals(getFlight(), ticket.getFlight());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTicketId(), getcID(), getPassportNo(), getExpiryDate(), getCheckedBag(), getCarryOnBag(), getMeal(), getCabinClass(), getFlight());
	}
}
