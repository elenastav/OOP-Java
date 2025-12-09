// Maragkou Sofia
//2012030078

package objects;

public class Patient {
	
	//variable declaration
	private String patientFirstName;
	private String patientLastName;
	private int patientAmka;
	
	public Patient(){
		this.patientFirstName=null;
		this.patientLastName=null;
		this.patientAmka=0;
	}
	
	
	// set methods
	public void setPatientFirstName(String name){patientFirstName=name;}
	public void setPatientLastName(String lastName){patientLastName=lastName;}
	public void setPatientAmka(int amka){patientAmka=amka;}
	
	//get methods
	public String getPatientFirstName() {return patientFirstName;}
	public String getPatientLastName() {return patientLastName;}
	public int getPatientAmka() {return patientAmka;}
	
	// print methods
	public void patientPrint(){
		System.out.println("The name of the patient is:" +this.getPatientFirstName());
		System.out.println("The last name of the patient is:" +this.getPatientLastName());
		System.out.println("The AMKA of the patient is:" +this.getPatientAmka());
	}
	
}
