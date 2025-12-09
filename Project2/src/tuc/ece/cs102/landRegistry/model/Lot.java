package tuc.ece.cs102.landRegistry.model;

public class Lot extends Property{
	private String type;
	private double maxBuildingArea;
	
	public Lot(int KA, String d, String m, double a, double v, double cz, String t, double mba) {
		super(KA, d, m, a, v, cz);
		type = t;
		maxBuildingArea = mba;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMaxBuildingArea() {
		return maxBuildingArea;
	}

	public void setMaxBuildingArea(double maxBuildingArea) {
		this.maxBuildingArea = maxBuildingArea;
	}
	
	public void print() {
		System.out.println("Property>Lot: " + this.toString());
	}
	
	public String toString() {
		return "Code of property: " +getKA() +"\t\tDistrict: " +getDistrict() +"\t\tMunicipality: " +getMunicipality() +"\t\tArea in sqare metres: " +getArea() +"\t\tFair value: " +getPropValue() +"\t\tCost of zone: " +getCostZone() +"\t\tType: " +getType() +"\t\tMaximum building area: " +getMaxBuildingArea();
	}

	public double estimateENFIA() {
		return costZone*area + 0.15*costZone*maxBuildingArea;
	}
}
