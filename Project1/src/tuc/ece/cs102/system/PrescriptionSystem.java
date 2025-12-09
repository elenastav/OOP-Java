package tuc.ece.cs102.system;

import java.util.Vector;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import tuc.ece.cs102.util.DatePeriod;
import tuc.ece.cs102.system.Prescription;


public class PrescriptionSystem {
	private String name;
	private String URL;
	
	private Vector<Patient> listOfPatients;
	private Vector<Doctor> listOfDoctors;
	private Vector<Drug> listOfDrugs;
	private Vector<Prescription> listOfPrescriptions;
	
	public PrescriptionSystem(String name, String URL) {
		this.name = name;
		this.URL = URL;
		
		listOfPatients = new Vector<Patient>();
		listOfDoctors = new Vector<Doctor>();
		listOfDrugs = new Vector<Drug>();
		listOfPrescriptions = new Vector<Prescription>();
	}
	
	public PrescriptionSystem() {
		listOfPatients = new Vector<Patient>();
		listOfDoctors = new Vector<Doctor>();
		listOfDrugs = new Vector<Drug>();
		listOfPrescriptions = new Vector<Prescription>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Vector<Patient> getListOfPatients() {
		return listOfPatients;
	}

	public Vector<Doctor> getListOfDoctors() {
		return listOfDoctors;
	}

	public Vector<Drug> getListOfDrugs() {
		return listOfDrugs;
	}

	public Vector<Prescription> getListOfPrescriptions() {
		return listOfPrescriptions;
	}
	
	public void addPatient(Patient p) {
		if (p.getNumOfEnrolledPatients() > p.getMaxNumOfPatients()) {
		    System.out.println ("You can't add any more patients to the system.");
		} else {
			listOfPatients.add(p);
			p.setNumOfEnrolledPatients(p.getNumOfEnrolledPatients() + 1);
		}
	}
	
	public void addDoctor(Doctor d) {
		if (d.getNumOfEnrolledDoctors() > d.getMaxNumOfDoctors()) {
		    System.out.println ("You can't add any more doctors to the system.");
		} else {
			listOfDoctors.add(d);
			d.setNumOfEnrolledDoctors(d.getNumOfEnrolledDoctors() + 1);
		}
	}
	
	public void addDrug(Drug d) {
		if (d.getNumOfPrescribedDrugs() > d.getMaxNumOfDrugs()) {
		    System.out.println ("You can't add any more drugs to the system.");
		} else {
			listOfDrugs.add(d);
			d.setNumOfPrescribedDrugs(d.getNumOfPrescribedDrugs() + 1);
		}
	}
	
	public void addPrescription(Prescription p, int numOfDrugs) {
		if (p.getNumOfCreatedPrescriptions() > p.getMaxNumOfPrescriptions()) {
			System.out.println ("You can't add any more prescriptions to the system.");
		} else {
		    listOfPrescriptions.add(p);
		    p.setNumOfCreatedPrescriptions(p.getNumOfCreatedPrescriptions() + 1);
	    	p.getPatient().getPatientPrescriptions().add(p);
		    p.getDoctor().getDoctorPrescriptions().add(p);
		    for (int i = 0; i < numOfDrugs; i++) {
			    p.getPrescriptionDrugs().get(i).getDrugPrescriptions().add(p);
		    }
		}
	}
	
	public void addNewPatient(String AMKA, String fName, String lName) {
		Patient p = new Patient(AMKA, fName, lName);
		this.addPatient(p);
	}
    
	public void addNewDoctor(String AAAE, String fName, String lName, String specialty) {
		Doctor d = new Doctor(AAAE, fName, lName, specialty);
		this.addDoctor(d);
	}
	
	public void addNewDrug(String code, String name, double cost) {
		Drug d = new Drug(code, name, cost);
		this.addDrug(d);
	}
	
	public Patient findPatientByAMKA(String AMKA) {
		for (int i = 0; i < this.listOfPatients.size(); i++) {
			Patient p = this.listOfPatients.get(i);
			if (p.getAMKA().equals(AMKA)) {
				return p;
			}
		}
		System.out.println("Error: Patient wasn't found.");
		return null;
	}
	
	public Doctor findDoctorByName(String fName, String lName) {
		for (int i = 0; i < this.listOfDoctors.size(); i++) {
			Doctor d = this.listOfDoctors.get(i);
			if (d.getFirstName().equals(fName) && d.getLastName().equals(lName)) {
				return d;
			}
		}
		System.out.println("Error: Doctor wasn't found.");
		return null;
	}
	
	public Doctor findDoctorByAAAE(String AAAE) {
		for (int i = 0; i < this.listOfDoctors.size(); i++) {
			Doctor d = this.listOfDoctors.get(i);
			if (d.getAAAE().equals(AAAE)) {
				return d;
			}
		}
		System.out.println("Error: Doctor wasn't found.");
		return null;
	}
	
	public Drug findDrugByName(String name) {
		for (int i = 0; i < this.listOfDrugs.size(); i++) {
			Drug d = this.listOfDrugs.get(i);
			if (d.getName().equals(name)) {
				return d;
			}
		}
		System.out.println("Error: Drug wasn't found.");
		return null;
	}
	
	public Drug findDrugByCode(String code) {
		for (int i = 0; i < this.listOfDrugs.size(); i++) {
			Drug d = this.listOfDrugs.get(i);
			if (d.getCode().equals(code)) {
				return d;
			}
		}
		System.out.println("Error: Drug wasn't found.");
		return null;
	}
	
	public void printPatientsCatalogue() {
		for (int i = 0; i < this.listOfPatients.size(); i++) {
			this.listOfPatients.get(i).println();
		}
	}
	
	public void printDoctorsCatalogue() {
		for (int i = 0; i < this.listOfDoctors.size(); i++) {
			this.listOfDoctors.get(i).println();
		}
	}
	
	public void printDrugsCatalogue() {
		for (int i = 0; i < this.listOfDrugs.size(); i++) {
			this.listOfDrugs.get(i).println();
		}
	}
	
	public void printPrescriptionsCatalogue() {
		for (int i = 0; i < this.listOfPrescriptions.size(); i++) {
			this.listOfPrescriptions.get(i).println();
		}
	}
	
	public Prescription addNewPrescription(Patient p, Doctor doc, Date startDate, int numOfDrugs) {
		Prescription presc = new Prescription(p, doc, startDate);
		Calendar c = Calendar.getInstance();
		Date creationDate = new Date();
		presc.setCreationDate(creationDate);
	    c.setTime(startDate);
		c.add(Calendar.DATE, 10);
		Date expirationDate = c.getTime();
		presc.setExpirationDate(expirationDate);
		presc.setPeriod(new DatePeriod(startDate, expirationDate));
		this.setCodeToPrescription(presc);
		presc.setTotalCost(0.0);
		return presc;	
	}
	
	public Prescription addDrugToPrescription(Drug d, Prescription presc) {
		presc.getPrescriptionDrugs().add(d);
		double sum = presc.getTotalCost() + d.getCost();
		presc.setTotalCost(sum);
		return presc;
	}
	
	public void printPatientPresciptions(Patient p) {
		for (int i = 0; i < p.getPatientPrescriptions().size(); i++) {
			p.getPatientPrescriptions().get(i).println();
		}
	}
	
	public void printDoctorPresciptions(Doctor d) {
		for (int i = 0; i < d.getDoctorPrescriptions().size(); i++) {
			d.getDoctorPrescriptions().get(i).println();
		}
	}
	
	public void printDrugPresciptions(Drug d) {
		for (int i = 0; i < d.getDrugPrescriptions().size(); i++) {
			d.getDrugPrescriptions().get(i).println();
		}
	}
	
	public void printPeriodPrescriptions(DatePeriod p) {
		for (int i = 0; i < this.listOfPrescriptions.size(); i++) {
			boolean a = this.listOfPrescriptions.get(i).getPeriod().overlaps(p);
			if (a) {
				this.listOfPrescriptions.get(i).println();
			} 
		}
	}
	
	public void deletePatient(Patient p) {
		if (p != null) {
		for (int i = 0; i < this.listOfDoctors.size(); i++) {
			for(int j = 0; j < listOfDoctors.get(i).getDoctorPrescriptions().size(); j++) {
	    	    if (p.equals(listOfDoctors.get(i).getDoctorPrescriptions().get(j).getPatient())) {
	    	    	listOfDoctors.get(i).getDoctorPrescriptions().remove(j);
	    	    }  
	        }
		}
		for (int i = 0; i < this.listOfDrugs.size(); i++) {
			for(int j = 0; j < listOfDrugs.get(i).getDrugPrescriptions().size(); j++) {
	    	    if (p.equals(listOfDrugs.get(i).getDrugPrescriptions().get(j).getPatient())) {
	    	    	listOfDrugs.get(i).getDrugPrescriptions().remove(j);
	    	    }  
	        }
		}
	    for (int i = 0; i < this.listOfPrescriptions.size(); i++) {
	    	if (p.equals(listOfPrescriptions.get(i).getPatient())) {
	    		listOfPrescriptions.remove(i);
	    	}
	    }
	    for (int i = 0; i < this.listOfPatients.size(); i++) {
			if (p.equals(listOfPatients.get(i))){
				listOfPatients.remove(i);
			}
		}
	    p.getPatientPrescriptions().removeAllElements();
	    p = null;
		} else {
			System.out.println("Error: Undefined Patient.");
		}
	}	
	
	public void setCodeToPrescription(Prescription p) {
		Random rand = new Random();
		int randInt = rand.nextInt(400);
		p.setCode(randInt);
	}
}
