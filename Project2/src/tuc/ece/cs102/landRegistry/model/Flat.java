package tuc.ece.cs102.landRegistry.model;

public class Flat extends Building{
	private int floor;
	private int numOfRooms;
	
	public Flat(int KA, String d, String m, double a, double v, double cz, String ba, int yoc, String use, int f, int nor) {
		super(KA, d, m ,a, v, cz, ba, yoc, use);
		floor = f;
		numOfRooms = nor;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public void print() {
		System.out.println("Property>Building>Flat: " + this.toString());
	}
	
	public String toString() {
		return "Code of property: " +getKA() +"\t\tDistrict: " +getDistrict() +"\t\tMunicipality: " +getMunicipality() +"\t\tArea in sqare metres: " +getArea() +"\t\tFair value: " +getPropValue() +"\t\tCost of zone: " +getCostZone() +"\t\tAddress: " +getBuildingAddress() +"\t\tYear of construction: " +getYearOfConstruction() +"\t\tUse of the building: " +getBuildingUse() +"\t\tFloor: " +getFloor() +"\t\tNumber of rooms: " +getNumOfRooms();
	}
	
	public double estimateENFIA() {
		return (costZone*area) * ageIndex() * (1 +floor*0.05);
	}
}
