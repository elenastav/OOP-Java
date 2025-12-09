// Maragkou Sofia
//2012030078

package objects;
public class Pharmacy {
	
	//variable declaration
	private String ownersFirstName;
	private String ownersLastName;
	private String pharmTown;
	private String pharmStreet;
	private String pharmNum;
	private String telephone;
	
	
	public Pharmacy(){
		this.ownersFirstName=null;
		this.ownersLastName=null;
		this.pharmTown=null;
		this.pharmStreet=null;
		this.pharmNum=null;
		this.telephone=null;
	}
	
	
	// set methods
	public void setOwnersFirstName(String name){ownersFirstName=name;}
	public void setOwnersLastName(String LastName){ownersLastName=LastName;}
	public void setPharmTown(String town){pharmTown=town;}
	public void setPharmSteet(String street){pharmStreet=street;}
	public void setPharmNum(String num){pharmNum=num;}
	public void setTel(String tel){ telephone=tel;}
	
	// get methods
	public String getOwnersFirstName() {return ownersFirstName;}
	public String getOwnersLastName() {return ownersLastName;}
	public String getPharmTown() {return pharmTown;}
	public String getPharmStreet() {return pharmStreet;}
	public String getPharmNum() {return pharmNum;}
	public String getTel() {return telephone;}
	
	
	
	
	


}
