package tuc.ece.cs102.landRegistry.model;

import tuc.ece.cs102.landRegistry.main.EnhancedSortedList;
import tuc.ece.cs102.landRegistry.main.TitleItem;

public abstract class Property {
	protected int KA;
	protected String district;
	protected String municipality;
	protected double area;
	protected double value;
	protected double costZone;
	protected EnhancedSortedList propertyTitles;
	
	public Property(int KA, String d, String m, double a, double v, double cz) {
		this.KA = KA;
		district = d;
		municipality = m;
		area = a;
		value = v;
		costZone = cz;
		propertyTitles = new EnhancedSortedList();
	}

	public int getKA() {
		return KA;
	}

	public void setKA(int kA) {
		KA = kA;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPropValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getCostZone() {
		return costZone;
	}

	public void setCostZone(double costZone) {
		this.costZone = costZone;
	}

	public EnhancedSortedList getPropertyTitles() {
		return propertyTitles;
	}

	public abstract void print();

    public abstract String toString();
    
    public void addPropertyTitle(Title tit) {
    	if (tit != null) {
    		propertyTitles.insert(new TitleItem(tit));
    	} else {
    		System.out.println("Title not found.");
    	}
	}
    
    public abstract double estimateENFIA();
    
}
