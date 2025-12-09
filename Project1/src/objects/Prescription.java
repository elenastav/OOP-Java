// Maragkou Sofia
//2012030078

package objects;
import java.util.Date;
public class Prescription {
	
	
	
	final int TotalAmount=6;
	
	//variable declaration
	private Doctor prescriptionDoctor; 
	private Patient prescriptionPatient;
	private Date prescriptionDate;
	private Medicine[] prescriptionMedicines = new Medicine[TotalAmount];
	private int numberOfMedicines;        
	private float medicineDosage[]= new float[TotalAmount]; 
	
	
	public Prescription(){
		this.prescriptionDoctor=null;
		this. prescriptionPatient=null;
		this.prescriptionDate=null;
		this.numberOfMedicines=0;
		for (int counter=0;counter<6;counter++)
			this.prescriptionMedicines[counter]=null;
		for (int counter=0;counter<6;counter++)
			this.medicineDosage[counter]=0;
	}
	
	
	
	// set methods
	
	public void setDoctor(Doctor doctor) {prescriptionDoctor = doctor;}
	public void setPatient(Patient patient) {prescriptionPatient = patient;}
	public void setDate(Date date) {prescriptionDate = date;}
	public void setNumberOfMedicines(int amount) {numberOfMedicines = amount;}
	public void setPrescriptionMedicines(Medicine medicine,int counter){
		prescriptionMedicines[counter]=medicine;
	}
	public void setDosage(int counter, float dosage){
		medicineDosage[counter]=dosage;
	}
	
	// get methods
	public Doctor getDoctor() {return prescriptionDoctor;}
	public Patient getPatient() {return prescriptionPatient;}
	public Date getDate() {return prescriptionDate;}
	public int getNumberOfMedicines() {return numberOfMedicines;}
	public Medicine getPrescriptionMedicines(int counter) {
		return this.prescriptionMedicines[counter];
	}
	public float getDosage(int counter){return this.medicineDosage[counter];}
	
	
	
	// print methods
	public void prescriptionPrint(){
		System.out.println("Doctor:");
		prescriptionDoctor.doctorPrint();
		System.out.println("Patient:");
		prescriptionPatient.patientPrint();
		System.out.println("Date:");
		System.out.println(prescriptionDate);
		System.out.println("Medicines:");
		for (int counter=0;counter<numberOfMedicines;counter++){
			System.out.println("The medicine number " +(counter+1));
			prescriptionMedicines[counter].medicinePrint();
			System.out.println("The dosage is:"+ medicineDosage[counter]);
		}
	}





}
