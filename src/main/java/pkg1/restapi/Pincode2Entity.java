package pkg1.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pincodes")
public class Pincode2Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	int pincode;
	String location;
	String town;
	String district;
	String state;
	String country;
	public Pincode2Entity(long id, int pincode, String location, String town, String district, String state,
			String country) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.location = location;
		this.town = town;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	public Pincode2Entity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
