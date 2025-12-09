package tuc.ece.cs102.system;
import java.util.Vector;

public class Drug {
	private String code;
	private String name;
	private double cost;
	private int numOfPrescribedDrugs = 0;
	private final int maxNumOfDrugs = 50;
    
	private Vector<Prescription> drugPrescriptions;
	
	public Drug(String code, String name, double cost) {
		this.code = code;
		this.name = name;
		this.cost = cost;
		
		drugPrescriptions = new Vector<Prescription>();
	}
	
	public Drug() {
		drugPrescriptions = new Vector<Prescription>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNumOfPrescribedDrugs() {
		return numOfPrescribedDrugs;
	}

	public void setNumOfPrescribedDrugs(int numOfPrescribedDrugs) {
		this.numOfPrescribedDrugs = numOfPrescribedDrugs;
	}

	public int getMaxNumOfDrugs() {
		return maxNumOfDrugs;
	}

	public Vector<Prescription> getDrugPrescriptions() {
		return drugPrescriptions;
	}

	public void addDrugPrescription(Prescription p) {
		drugPrescriptions.add(p);
	}
	
	public void print() {
		System.out.print("Code: " +this.code +", Name: " +this.name +", Cost: " +this.cost);
	}
	
	public void println() {
		System.out.println("Code: " +this.code +", Name: " +this.name +", Cost: " +this.cost);
	}
}
