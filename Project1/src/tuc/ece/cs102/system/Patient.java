package tuc.ece.cs102.system;
import java.util.Vector;

public class Patient {
	private String AMKA;
	private String firstName;
	private String lastName;
	private int numOfEnrolledPatients = 0;
	private final int maxNumOfPatients = 100;
	
	private Vector<Prescription> patientPrescriptions;
	
	public Patient(String AMKA, String fName, String lName) {
		this.AMKA = AMKA;
		firstName = fName;
		lastName = lName;
		
		patientPrescriptions = new Vector<Prescription>();
	}
	
	public Patient() {
		patientPrescriptions = new Vector<Prescription>();
	}


	public String getAMKA() {
		return AMKA;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Vector<Prescription> getPatientPrescriptions() {
		return patientPrescriptions;
	}

	public void setAMKA(String aMKA) {
		AMKA = aMKA;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getNumOfEnrolledPatients() {
		return numOfEnrolledPatients;
	}

	public void setNumOfEnrolledPatients(int numOfEnrolledPatients) {
		this.numOfEnrolledPatients = numOfEnrolledPatients;
	}

	public int getMaxNumOfPatients() {
		return maxNumOfPatients;
	}

	public void addPatientPrescription(Prescription p) {
		patientPrescriptions.add(p);
	}

	public void print() {
		System.out.print("AMKA: " +this.AMKA +", First name: " +this.firstName +", Last name: " +this.lastName);
	}
	
	public void println() {
		System.out.println("AMKA: " +this.AMKA +", First name: " +this.firstName +", Last name: " +this.lastName);
	}
}
