//Maragkou Sofia
//2012030078

package objects;

public class Doctor {
	
	//variable declaration
	private String doctorFirstName;
	private String doctorLastName;
	private int doctorCode;
	
	public Doctor(){
		this.doctorFirstName=null;
		this.doctorLastName=null;
		this.doctorCode=0;
	}
	
	
	// get methods
	public String getDoctorFirstName() {return doctorFirstName;}
	public String getDoctorLastName() {return doctorLastName;}
	public int getDoctorCode() {return doctorCode;}
	
	// set methods
	public void setDoctorFirstName(String name){doctorFirstName=name;}
	public void setDoctorLastName(String lastName){doctorLastName=lastName;}
	public void setDoctorCode(int code){doctorCode=code;}
	
	// print methods
	public void doctorPrint(){
		System.out.println("The name of the doctor is:" +this.getDoctorFirstName());
		System.out.println("The last name of the doctor is:" +this.getDoctorLastName());
		System.out.println("The AM of the doctor is:" +this.getDoctorCode());
		
		
	}

	

}
