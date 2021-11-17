package com.revature.models;

import java.util.Objects; 

import javax.persistence.*;

@Entity
@Table(name="spaceport")
public class Spaceport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sp_id", updatable = false)
    private int SpID;

    @Column(name = "sp_name", columnDefinition = "varchar(25)")
    private String spName;

    @Column(name = "planet", columnDefinition = "varchar(15)")
    private String planet;
    
    public Spaceport() {
		super();
	}

	public Spaceport(int SpID, String spName, String planet) {
		super();
		this.SpID = SpID;
		this.spName = spName;
		this.planet = planet;
	}

	public int getSpID() {
		return SpID;
	}

	public void setSpID(int SpID) {
		this.SpID = SpID;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	

	@Override
	public String toString() {
		return "Spaceport [SpID=" + SpID + ", spName=" + spName + ", planet=" + planet + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(planet, SpID, spName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spaceport other = (Spaceport) obj;
		return Objects.equals(planet, other.planet) && SpID == other.SpID && Objects.equals(spName, other.spName);
	}

    
    
}
