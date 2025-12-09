package tuc.ece.cs102.system;
import java.util.Vector;

public class Doctor {
	private String AAAE;
	private String firstName;
	private String lastName;
	private String specialty;
	private int numOfEnrolledDoctors = 0;
	private final int maxNumOfDoctors = 100;
	
	private Vector<Prescription> doctorPrescriptions;
	
	public Doctor(String AAAE, String fName, String lName, String specialty) {
		this.AAAE = AAAE;
		firstName = fName;
		lastName = lName;
		this.specialty = specialty;
		
		doctorPrescriptions = new Vector<Prescription>();
	}
	
	public Doctor() {
		doctorPrescriptions = new Vector<Prescription>();
	}

	public String getAAAE() {
		return AAAE;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSpecialty() {
		return specialty;
	}

	public Vector<Prescription> getDoctorPrescriptions() {
		return doctorPrescriptions;
	}

	public void setAAAE(String aAAE) {
		AAAE = aAAE;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public int getNumOfEnrolledDoctors() {
		return numOfEnrolledDoctors;
	}

	public void setNumOfEnrolledDoctors(int numOfEnrolledDoctors) {
		this.numOfEnrolledDoctors = numOfEnrolledDoctors;
	}

	public int getMaxNumOfDoctors() {
		return maxNumOfDoctors;
	}

	public void addDoctorPrescription(Prescription p) {
		doctorPrescriptions.add(p);
	}
	
	public void print() {
		System.out.print("AAAE: " +this.AAAE +", First name: " +this.firstName +", Last name: " +this.lastName +", Specialty: " +this.specialty);
	}
	
	public void println() {
		System.out.println("AAAE: " +this.AAAE +", First name: " +this.firstName +", Last name: " +this.lastName +", Specialty: " +this.specialty);
	}

}
