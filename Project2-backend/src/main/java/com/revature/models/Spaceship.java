package com.revature.models;

import java.util.Objects; 

import javax.persistence.*;

@Entity
@Table(name="spaceship")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_id")
    private int SsID;
    
    @Column(name = "num_seats")
    private int numSeats;

    @Column(name = "type_of_spaceship")
    private String typeOfSpaceship;

    @Column(name = "ss_name")
    private String ssName;

   
    
    
	public Spaceship() {
		super();
	}
	

	public Spaceship(int SsID, String typeOfSpaceship, String ssName, int numSeats) {
		super();
		this.SsID = SsID;
		this.typeOfSpaceship = typeOfSpaceship;
		this.ssName = ssName;
		this.numSeats = numSeats;
	}


	public int getSsID() {
		return SsID;
	}

	public void setSsID(int SsID) {
		this.SsID = SsID;
	}

	public String getTypeOfSpaceship() {
		return typeOfSpaceship;
	}

	public void setTypeOfSpaceship(String typeOfSpaceship) {
		this.typeOfSpaceship = typeOfSpaceship;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}


	@Override
	public String toString() {
		return "Spaceship [SsID=" + SsID + ", typeOfSpaceship=" + typeOfSpaceship + ", ssName=" + ssName + ", numSeats="
				+ numSeats + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(numSeats, SsID, ssName, typeOfSpaceship);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spaceship other = (Spaceship) obj;
		return numSeats == other.numSeats && SsID == other.SsID && Objects.equals(ssName, other.ssName)
				&& Objects.equals(typeOfSpaceship, other.typeOfSpaceship);
	}
    
    

}
