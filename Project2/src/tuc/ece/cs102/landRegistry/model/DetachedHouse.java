package tuc.ece.cs102.landRegistry.model;

public class DetachedHouse extends Building{
	private int highestFloor;
	private double poolArea;
	
	public DetachedHouse(int KA, String d, String m, double a, double v, double cz, String ba, int yoc, String use, int hf, double pa) {
		super(KA, d, m ,a, v, cz, ba, yoc, use);
		highestFloor = hf;
		poolArea = pa;
	}

	public int getHighestFloor() {
		return highestFloor;
	}

	public void setHighestFloor(int highestFloor) {
		this.highestFloor = highestFloor;
	}

	public double getPoolArea() {
		return poolArea;
	}

	public void setPoolArea(double poolArea) {
		this.poolArea = poolArea;
	}
	
	public void print() {
		System.out.println("Property>Building>Detached house: " + this.toString());
	}
	
	public String toString() {
		return "Code of property: " +getKA() +"\t\tDistrict: " +getDistrict() +"\t\tMunicipality: " +getMunicipality() +"\t\tArea in sqare metres: " +getArea() +"\t\tFair value: " +getPropValue() +"\t\tCost of zone: " +getCostZone() +"\t\tAddress: " +getBuildingAddress() +"\t\tYear of construction: " +getYearOfConstruction() +"\t\tUse of the building: " +getBuildingUse() +"\t\tHighest floor: " +getHighestFloor() +"\t\tArea of pool in square metres: " +getPoolArea();
	}

	public double estimateENFIA() {
		return (costZone*area) * ageIndex() + poolArea*10;
	}
}
