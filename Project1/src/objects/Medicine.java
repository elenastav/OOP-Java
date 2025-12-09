//Maragkou Sofia
//2012030078

package objects;

public class Medicine {
	
	
	
	//variable declaration
	private int medicineCode;
	private String medicineName;
	private float medicinePrice;
	

	public Medicine(){
		this.medicineCode=0;
		this.medicineName=null;
		this.medicinePrice=0;
	}
	
	//set methods
	public void setMedicineCode(int code){medicineCode=code;}
	public void setMedicineName(String name){medicineName=name;}
	public void setMedicinePrice(float price){medicinePrice=price;}

	// get methods
	public int getMedicineCode() {return medicineCode;}
	public String getMedicineName() {return medicineName;}
	public float getMedicinePrice(){return medicinePrice;}
	
	
	// print method
	public void medicinePrint(){
		System.out.println("The name of the medicine is:" +this.getMedicineName());
		System.out.println("The code of the medicine is:" +this.getMedicineCode());
		System.out.println("The price of the medicine is:" +this.getMedicinePrice()+" euro");
	}

}
