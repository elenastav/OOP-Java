package tuc.ece.cs102.system;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;
import tuc.ece.cs102.util.DatePeriod;

public class Prescription {
	private int code;
	private Patient patient;
	private Doctor doctor;
	private double totalCost;
	private Date creationDate;
	private Date startDate;
	private Date expirationDate;
	private DatePeriod period;
	private int numOfCreatedPrescriptions = 0;
	private final int maxNumOfPrescriptions = 400;
	
	private Vector<Drug> prescriptionDrugs;
	
	public Prescription(int code, Date cDate, Patient p, Doctor d, double tCost, Date eDate, Date sDate) {
		this.code = code;
		creationDate = cDate;
		patient = p;
		doctor = d;
		totalCost = tCost;
		expirationDate = eDate;
		startDate = sDate;
		period = new DatePeriod(startDate, expirationDate);
		
		prescriptionDrugs = new Vector<Drug>();
	}

	public Prescription(Patient p, Doctor d, Date sDate) {
		patient = p;
		doctor = d;
		startDate = sDate;
		
		prescriptionDrugs = new Vector<Drug>();
	}
	
	public Prescription() {
	
		prescriptionDrugs = new Vector<Drug>();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Vector<Drug> getPrescriptionDrugs() {
		return prescriptionDrugs;
	}
	
	public void setPrescriptionDrugs(Vector<Drug> prescriptionDrugs) {
		this.prescriptionDrugs = prescriptionDrugs;
	}

	public int getNumOfCreatedPrescriptions() {
		return numOfCreatedPrescriptions;
	}

	public void setNumOfCreatedPrescriptions(int numOfCreatedPrescriptions) {
		this.numOfCreatedPrescriptions = numOfCreatedPrescriptions;
	}

	public int getMaxNumOfPrescriptions() {
		return maxNumOfPrescriptions;
	}

	public DatePeriod getPeriod() {
		return period;
	}

	public void setPeriod(DatePeriod period) {
		this.period = period;
	}

	public void addPrescriptionDrug(Drug d) {
		prescriptionDrugs.add(d);
	}
	
	public void print() {
		System.out.print("Prescription code: " +this.code +", Total cost: " +this.totalCost +", Creation date: " +this.creationDate +", Start date: " +this.startDate +", Expiration date: " +this.expirationDate);
	    for (int i = 0; i < this.getPrescriptionDrugs().size(); i++) {
	    	System.out.print("Drug:");
	    	this.getPrescriptionDrugs().get(i).print();
	    }
	    System.out.print("Patient:");
	    this.getPatient().print();
	    System.out.print("Doctor:");
	    this.getDoctor().print();
	}
	
	public void println() {
		System.out.println("Prescription code: " +this.code +", Total cost: " +this.totalCost +", Creation date: " +this.creationDate +", Start date: " +this.startDate +", Expiration date: " +this.expirationDate);
	    for (int i = 0; i < this.getPrescriptionDrugs().size(); i++) {
	    	System.out.println("Drug:");
	    	this.getPrescriptionDrugs().get(i).println();
	    }
	    System.out.println("Patient:");
	    this.getPatient().println();
	    System.out.println("Doctor:");
	    this.getDoctor().println();
	}
}
