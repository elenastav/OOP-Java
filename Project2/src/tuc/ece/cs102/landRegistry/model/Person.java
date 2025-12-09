package tuc.ece.cs102.landRegistry.model;

import java.util.Date;

public class Person extends Owner{
	private String homeAddress;
	private Date dateOfBirth;
	
	public Person(int afm, String name, String address, Date date) {
		super(afm, name);
		homeAddress = address;
		dateOfBirth = date;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void print() {
		System.out.println("Owner>Person: " +this.toString());
	}
	
	public String toString() {
		return "AFM: " +getAfm() +"\t\tName: " +getOwnerName() +"\t\tAddress: " +getHomeAddress() +"\t\tDate of birth: " +getDateOfBirth();
	}

}
