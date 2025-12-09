package tuc.ece.cs102.landRegistry.model;

public class Business extends Owner{
	private String baseAddress;
	private String representativeName;
	
	public Business(int afm, String name, String address, String rName) {
		super(afm, name);
		baseAddress = address;
		representativeName = rName;
	}

	public String getBaseAddress() {
		return baseAddress;
	}

	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	
	public void print() {
		System.out.println("Owner>Business: " +this.toString());
	}
	
	public String toString() {
		return "AFM: " +getAfm() +"\t\tName: " +getOwnerName() +"\t\tAddress: " +getBaseAddress() +"\t\tName of representative: " +getRepresentativeName();
	}

}
