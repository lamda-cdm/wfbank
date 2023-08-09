package org.example.MyFirstProj.model;

public class Address {
	private String addressline;
	private String landmark;
	private String state;
	private String city;
	private String pincode;
	
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String addressline, String landmark , String state, String city, String pincode) {
		super();
		setAddressline(addressline);
		setLandmark(landmark);
		setState(state);
		setCity(city);
		setPincode(pincode);
	}
	@Override
	public String toString() {
		return "Address [addressline=" + addressline + ", landmark=" + landmark + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
}
