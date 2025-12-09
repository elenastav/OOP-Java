package tuc.ece.cs102.landRegistry.model;

public abstract class Building extends Property {
	protected String buildingAddress;
	protected int yearOfConstruction;
	protected String buildingUse;
	
	public Building(int KA, String d, String m, double a, double v, double cz, String ba, int yoc, String bu) {
		super(KA, d, m ,a, v, cz);
		buildingAddress = ba;
		yearOfConstruction = yoc;
		buildingUse = bu;
	}

	public String getBuildingAddress() {
		return buildingAddress;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public String getBuildingUse() {
		return buildingUse;
	}

	public void setBuildingUse(String buildingUse) {
		this.buildingUse = buildingUse;
	}

	public abstract void print();

    public abstract String toString();
    
    public abstract double estimateENFIA();
    
    public double ageIndex(){
    	if (2020 - yearOfConstruction <= 10) {
    		return 1;
    	} else if (2020 - yearOfConstruction <= 20) {
    		return 0.9;
    	} else if (2020 - yearOfConstruction <= 30) {
    		return 0.8;
    	} else {
    		return 0.5;
    	}
    }
}
