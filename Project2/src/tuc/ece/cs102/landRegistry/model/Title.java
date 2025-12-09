package tuc.ece.cs102.landRegistry.model;

import java.util.Date;

public class Title {
	private int KT;
	private Date dateOfAcquirement;
	private Property property;
	private Owner owner;
	private double ownershipPercentage;
	private String ownershipType;
	
	public Title(Date d, Property p, Owner o, double op, String ot) {
		dateOfAcquirement = d;
		property = p;
		owner = o;
		ownershipPercentage = op;
		ownershipType = ot;
	}
	
	public Title(Property p, Owner o, double op, String ot) {
		property = p;
		owner = o;
		ownershipPercentage = op;
		ownershipType = ot;
	}

	public int getKT() {
		return KT;
	}

	public void setKT(int kT) {
		KT = kT;
	}

	public Date getDateOfAcquirement() {
		return dateOfAcquirement;
	}

	public void setDateOfAcquirement(Date dateOfAcquirement) {
		this.dateOfAcquirement = dateOfAcquirement;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public double getOwnershipPercentage() {
		return ownershipPercentage;
	}

	public void setOwnershipPercentage(double ownershipPercentage) {
		this.ownershipPercentage = ownershipPercentage;
	}
	
	public String getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}

	public void print() {
		System.out.println("Title: " +this.toString());
	}
	
	public String toString() {
		return "Code of title: " +getKT() +"\t\tDate of acquirement: " +getDateOfAcquirement() +"\t\tProperty: " +getProperty().toString() +"\t\tOwner: " +getOwner().toString() +"\t\tOwnership percentage: " +getOwnershipPercentage() +"\t\tOwnership type: " +getOwnershipType();
	}

	public double estimateTitleENFIA() {
		return (property.estimateENFIA()) * ownershipPercentage * 0.01;
	}
}
