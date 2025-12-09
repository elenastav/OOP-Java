package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.util.StandardInputRead;
import tuc.ece.cs102.landRegistry.model.Property;
import tuc.ece.cs102.landRegistry.model.Owner;
import tuc.ece.cs102.landRegistry.model.Flat;
import tuc.ece.cs102.landRegistry.model.DetachedHouse;
import tuc.ece.cs102.landRegistry.model.Lot;
import tuc.ece.cs102.landRegistry.model.Person;
import tuc.ece.cs102.landRegistry.model.Business;
import java.util.Date;


public class LandRegistryConsole {
	private LandRegistry lr;
	
	public LandRegistry getLr() {
		return lr;
	}

	public void setLr(LandRegistry lr) {
		this.lr = lr;
	}

	private StandardInputRead reader;
	private int userOption;
	
	public LandRegistryConsole() {
		lr = new LandRegistry();
		reader = new StandardInputRead();
		userOption=0;
	}
	
	public static void main(String[] args) {
		
		LandRegistryConsole lrc = new LandRegistryConsole();
		int userOption = 0;
		StandardInputRead reader = new StandardInputRead();
		
		while (userOption != 11) {
			lrc.printMenu();
			String userInput = reader.readString("What would you like to do? ");
            if (userInput == null) {
                continue;
            } else {
                try {
                    userOption = Integer.parseInt(userInput);
                } catch (NumberFormatException ex) {
                    userOption = 0;
                }
            }	            
            switch (userOption) {
                case 0:
                    continue;
                case 1:
                	lrc.findProperty();
                	reader.readString("Press any key to continue...");
                    break;
                case 2:
                	lrc.getLr().getProperties().printAllItems();
                	reader.readString("Press any key to continue...");
                    break;
                case 3:
                	lrc.printPropertiesByCategory();
                	reader.readString("Press any key to continue...");
                    break;
                case 4:
                	lrc.findOwner();
                	reader.readString("Press any key to continue...");
                    break;
                case 5:
                	lrc.addNewTitle();
                	reader.readString("Press any key to continue...");
                    break;
                case 6:
                	userOption = 0;
                	while (userOption>2 || userOption<1) {
            			lrc.printSubMenu();
            			userInput = reader.readString(": ");
                        if (userInput == null) {
                            continue;
                        } else {
                            try {
                                userOption = Integer.parseInt(userInput);
                            } catch (NumberFormatException ex) {
                                userOption = 0;
                            }
                        }	            
                        switch (userOption) {
                            case 0:
                                continue;
                            case 1:
                            	lrc.printPropertyTitles();
                            	reader.readString("Press any key to continue...");
                                break;
                            case 2:
                            	lrc.printOwnerTitles();
                            	reader.readString("Press any key to continue...");
                                break;
                        }
                	}
                    break;
                case 7:
                	lrc.estimateTotalValue();
                	reader.readString("Press any key to continue...");
                    break;
                case 8:
                	lrc.estimateOwnENFIA();
                	reader.readString("Press any key to continue...");
                    break;
                case 9:
                	lrc.addNewProperty();
                	reader.readString("Press any key to continue...");
                    break;
                case 10:
                	lrc.addNewOwner();
                	reader.readString("Press any key to continue...");
                    break;
                case 11:
                	System.out.println("Thanks for using the Land Registry Console...");
                	break;
                default:	                    
                    System.out.println("User option " + userOption + " ignored...");
                    continue; 	
            }
		}
	}
	
	
	public void printMenu(){		
		System.out.println("----------------------Menu------------------------");
		System.out.println("--------------------------------------------------");		
		System.out.println("1)Search for property");
		System.out.println("2)Print properties");
		System.out.println("3)Print properties by category");
		System.out.println("4)Search for owner");
		System.out.println("5)Insert new title");
		System.out.println("6)Print titles for a property/of an owner");
		System.out.println("7)Estimate total value of a property");
		System.out.println("8)Estimate ENFIA of an owner");
		System.out.println("9)Insert new property");
		System.out.println("10)Insert new owner");
		System.out.println("11)Exit");
	}
	
	public void printSubMenu() {
		System.out.println("Which titles would you like to print?");
		System.out.println("1)Titles for a property");
		System.out.println("2)Titles of an owner");
	}
		
	public void findProperty(){				
		int key;			
		key = reader.readPositiveInt("Property's code:");					
		Property p = lr.searchForProperty(key);
		if (p == null){
			System.out.println("");
		}else{
			p.print();
		}			
	}
	
	public void findOwner(){				
		int key;			
		key = reader.readPositiveInt("Owner's AFM:");					
		Owner o = lr.searchForOwner(key);
		if (o == null){
			System.out.println("");
		}else{
			o.print();
		}			
	}
	
	public void printPropertiesByCategory() {
		userOption=0;
		while(userOption>4 || userOption<1){
			System.out.println("===========Choose Category============");
			System.out.println("1)Flat");
			System.out.println("2)Detached House");
			System.out.println("3)Lot");
			System.out.println("4)Cancel");
			userOption= reader.readPositiveInt(":");
		}
		switch (userOption){		
		case 1:
			lr.printPropertiesByCategory("tuc.ece.cs102.landRegistry.model.Flat");
			break;
		case 2:
			lr.printPropertiesByCategory("tuc.ece.cs102.landRegistry.model.DetachedHouse");
			break;
		case 3:
			lr.printPropertiesByCategory("tuc.ece.cs102.landRegistry.model.Lot");
			break;
		case 4:	
			break;
		}		
	}
	
	public void printPropertyTitles() {
		int KA = reader.readPositiveInt("Give the code of the property: ");
		lr.printPropertyTitles(KA);
	}
	
	public void printOwnerTitles() {
		int afm = reader.readPositiveInt("Give the AFM of the owner: ");
		lr.printOwnerTitles(afm);
	}
	
	public void addNewTitle() {
		int afm = reader.readPositiveInt("Give the AFM of the owner: ");
		int KA = reader.readPositiveInt("Give the code of the property: ");
		double percent = reader.readPositiveFloat("Give the percentage of the ownership: ");
		String type = reader.readString("Give the type of the ownership: ");
		lr.addNewTitle(afm, KA, percent, type);
	}
	
	public void addNewProperty() {
		userOption=0;
		while(userOption>4 || userOption<1){
			System.out.println("===========Insert New Property============");
			System.out.println("1)Flat");
			System.out.println("2)Detached House");
			System.out.println("3)Lot");
			System.out.println("4)Cancel");
			userOption= reader.readPositiveInt(":");
		}
		int KA, yoc, f, nor, hf;
		double a, v, cz, pa, mba;
		String d, m, ba, use, t;
		
		switch (userOption){		
		case 1:
		    KA = reader.readPositiveInt("Give the code of the property: ");
		    d = reader.readString("Give the district: ");
		    m = reader.readString("Give the municipality: ");
		    a = reader.readPositiveFloat("Give the area in square metres: ");
		    v = reader.readPositiveFloat("Give the value: ");
		    cz = reader.readPositiveFloat("Give the cost of the zone: ");
		    ba = reader.readString("Give the address: ");
		    yoc = reader.readPositiveInt("Give the year of construction: ");
		    use = reader.readString("Give the use of the building: ");
		    f = reader.readPositiveInt("Give the floor: ");
		    nor = reader.readPositiveInt("Give the number of rooms: ");
		    lr.addProperty(new Flat(KA, d, m ,a, v, cz, ba, yoc, use, f, nor));
		    System.out.println("Property Added...");
			break;
		case 2:
			KA = reader.readPositiveInt("Give the code of the property: ");
		    d = reader.readString("Give the district: ");
		    m = reader.readString("Give the municipality: ");
		    a = reader.readPositiveFloat("Give the area in square metres: ");
		    v = reader.readPositiveFloat("Give the value: ");
		    cz = reader.readPositiveFloat("Give the cost of the zone: ");
		    ba = reader.readString("Give the address: ");
		    yoc = reader.readPositiveInt("Give the year of construction: ");
		    use = reader.readString("Give the use of the building: ");
		    hf = reader.readPositiveInt("Give the highest floor: ");
		    pa = reader.readPositiveFloat("Give the area of the pool in square metres(if it doesn't exist, type 0): ");
		    lr.addProperty(new DetachedHouse(KA, d, m ,a, v, cz, ba, yoc, use, hf, pa));
		    System.out.println("Property Added...");
			break;
		case 3:
			KA = reader.readPositiveInt("Give the code of the property: ");
		    d = reader.readString("Give the district: ");
		    m = reader.readString("Give the municipality: ");
		    a = reader.readPositiveFloat("Give the area in square metres: ");
		    v = reader.readPositiveFloat("Give the value: ");
		    cz = reader.readPositiveFloat("Give the cost of the zone: ");
		    t = reader.readString("Give the type of the lot: ");
		    mba = reader.readPositiveFloat("Give the maximum building area(if it is a parcel,type 0): ");
		    lr.addProperty(new Lot(KA, d, m ,a, v, cz, t, mba));
		    System.out.println("Property Added...");
			break;
		case 4:
			break;
		}
	}
	
	public void addNewOwner() {
		userOption=0;
		while(userOption>3 || userOption<1){
			System.out.println("===========Insert New Owner============");
			System.out.println("1)Person");
			System.out.println("2)Business");
			System.out.println("3)Cancel");
			userOption= reader.readPositiveInt(":");
		}
		int afm;
		String name, address, rName;
		Date date;
		
		switch (userOption){		
		case 1:
			afm = reader.readPositiveInt("Give the owner's AFM: ");
		    name = reader.readString("Give the name: ");
		    address = reader.readString("Give the person's home address: ");
		    date = reader.readDate("Give the date of birth: ");
		    lr.addOwner(new Person(afm, name, address, date));
		    System.out.println("Owner Added...");
			break;
		case 2:
			afm = reader.readPositiveInt("Give the owner's AFM: ");
		    name = reader.readString("Give the name: ");
		    address = reader.readString("Give the business's base address: ");
		    rName = reader.readString("Give the representative's name: ");
		    lr.addOwner(new Business(afm, name, address, rName));
		    System.out.println("Owner Added...");
			break;
		case 3:
			break;
		}
	}
	
	public void estimateTotalValue() {
		int afm = reader.readPositiveInt("Give the AFM of the owner: ");
		lr.estimateTotalValue(afm);
	}
	
	public void estimateOwnENFIA() {
		int afm = reader.readPositiveInt("Give the AFM of the owner: ");
		lr.estimateOwnENFIA(afm);
	}

}
