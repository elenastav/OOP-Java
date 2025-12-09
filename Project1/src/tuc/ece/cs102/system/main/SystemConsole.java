package tuc.ece.cs102.system.main;

import tuc.ece.cs102.system.Doctor;
import tuc.ece.cs102.system.Patient;
import tuc.ece.cs102.system.Drug;
import tuc.ece.cs102.system.Prescription;
import tuc.ece.cs102.system.PrescriptionSystem;
import tuc.ece.cs102.util.StandardInputRead;
import tuc.ece.cs102.util.DatePeriod;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class SystemConsole {
	
	public static void main(String[] args) {
		
		PrescriptionSystem sys = new PrescriptionSystem("Prescriptions", "http://courses.ece.tuc.gr/");
			
		sys.addPatient(new Patient("1965654655", "цеыяциа", "жяацйисйатоу"));	
		sys.addPatient(new Patient("1974020145", "басикийг", "мийгтопоукоу"));
		sys.addPatient(new Patient("1982014567", "лаяиа", "амдяиопоукоу"));
		sys.addPatient(new Patient("1978030240", "диомусиа", "памацайг"));
		sys.addPatient(new Patient("2017335604", "еутеяпг", "йуяламидоу"));
		sys.addPatient(new Patient("1976059123", "бийтыяиа", "тфоуяа"));
		sys.addPatient(new Patient("1994328235", "жяатфесйа", "мтоуяоу"));
		sys.addPatient(new Patient("1999378431", "екемг", "тсайакидоу"));
		sys.addPatient(new Patient("2013369307", "йымстамтима", "аццекопоукоу"));
		sys.addPatient(new Patient("1973427485", "екемг", "лоуфопоукоу"));
		sys.addPatient(new Patient("2015360809", "амтиопг", "цяабамг"));
		sys.addPatient(new Patient("2002388680", "хеодыяа", "хеыдояопоукоу"));
		
		sys.addDoctor(new Doctor("7718", "жаидым дглосхемгс", "саяайгмос", "пахокоцос"));
		sys.addDoctor(new Doctor("3644", "аийатеяимг", "тсеккоу", "ояхопедийос"));
		sys.addDoctor(new Doctor("8391", "тфамгс", "жытайгс", "ояхопедийос"));
		sys.addDoctor(new Doctor("9456", "цеыяциос", "вафкгс", "межяокоцос"));
		sys.addDoctor(new Doctor("2193", "иасым", "вяусолаккгс", "йаядиокоцос"));
		sys.addDoctor(new Doctor("3336", "йымстамтимос", "алпатфидгс", "йаядиокоцос"));
		sys.addDoctor(new Doctor("4918", "сытгягс", "амдяеоу", "ьувиатяос"));
		sys.addDoctor(new Doctor("8775", "лаяиа", "аяцуяиоу", "ьувиатяос"));
		sys.addDoctor(new Doctor("8909", "апостокос мийокаос", "базкайгс", "ояхопедийос"));
		sys.addDoctor(new Doctor("8843", "сожойкгс жикаяетос", "цабяигкидгс", "пмеуломокоцос"));
		sys.addDoctor(new Doctor("9089", "йымстамтимос ояестгс", "циаммайопоукос", "акеяциокоцос"));
		sys.addDoctor(new Doctor("3669", "хеодыяа", "хеодыяопоукоу", "пахокоцос"));
		
		sys.addDrug(new Drug("66705", "VILIMEN F.C.TAB 10MG/TAB BTx30", 8.62));
		sys.addDrug(new Drug("77646", "VILIMEN F.C.TAB 20MG/TAB BTx28", 3.50));
		sys.addDrug(new Drug("91091", "SILODOSIN/RONTIS CAPS 4MG/CAP", 7.40));
		sys.addDrug(new Drug("83355", "SILODOSIN/RONTIS CAPS 8MG/CAP", 6.00));
		sys.addDrug(new Drug("61654", "DINAPLEX CAPS (0.5+0.4)MG/CAP", 2.20));
		sys.addDrug(new Drug("27156", "FLUCANID CAPS 100MG/CAP", 2.80));
		sys.addDrug(new Drug("94464", "FLUCANID CAPS 200MG/CAP", 12.00));
		sys.addDrug(new Drug("49907", "FLUSENIL CAPS 150MG/CAP", 15.00));
		sys.addDrug(new Drug("94763", "NORBAL TAB 10MG/TAB", 11.47));
		sys.addDrug(new Drug("73286", "ZORTAL F.C.TAB 100MG/TAB", 3.55));
		sys.addDrug(new Drug("99555", "ZORTAL F.C.TAB 50MG/TAB", 5.80));
		sys.addDrug(new Drug("88825", "DORALIN F.C.TAB 40MG/TAB", 6.90));
		
		Prescription presc;
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1965654655"), sys.findDoctorByAAAE("7718"), new SimpleDateFormat("dd/MM/yyyy").parse("21/06/2020"), 3);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("66705"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("73286"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("99555"), presc);
			sys.addPrescription(presc, 3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1978030240"), sys.findDoctorByAAAE("3644"), new SimpleDateFormat("dd/MM/yyyy").parse("24/06/2020"), 3);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("77646"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("91091"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("49907"), presc);
			sys.addPrescription(presc, 3);	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("2002388680"), sys.findDoctorByAAAE("8391"), new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2020"), 1);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("88825"), presc);
			sys.addPrescription(presc, 1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("2002388680"), sys.findDoctorByAAAE("9456"), new SimpleDateFormat("dd/MM/yyyy").parse("06/06/2020"), 4);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("99555"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("73286"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("94763"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("27156"), presc);
			sys.addPrescription(presc, 4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1994328235"), sys.findDoctorByAAAE("2193"), new SimpleDateFormat("dd/MM/yyyy").parse("17/06/2020"), 3);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("88825"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("73286"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("66705"), presc);
			sys.addPrescription(presc, 3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1965654655"), sys.findDoctorByAAAE("3644"), new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2020"), 1);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("99555"), presc);
			sys.addPrescription(presc, 1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1973427485"), sys.findDoctorByAAAE("4918"), new SimpleDateFormat("dd/MM/yyyy").parse("05/07/2020"), 2);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("94464"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("77646"), presc);
			sys.addPrescription(presc, 2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1976059123"), sys.findDoctorByAAAE("3644"), new SimpleDateFormat("dd/MM/yyyy").parse("03/07/2020"), 3);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("27156"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("94763"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("73286"), presc);
			sys.addPrescription(presc, 3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("2013369307"), sys.findDoctorByAAAE("8909"), new SimpleDateFormat("dd/MM/yyyy").parse("03/07/2020"), 2);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("49907"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("27156"), presc);
			sys.addPrescription(presc, 2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1978030240"), sys.findDoctorByAAAE("7718"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2020"), 4);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("94763"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("66705"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("77646"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("83355"), presc);
			sys.addPrescription(presc, 4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1973427485"), sys.findDoctorByAAAE("7718"), new SimpleDateFormat("dd/MM/yyyy").parse("27/06/2020"), 3);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("61654"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("27156"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("94464"), presc);
			sys.addPrescription(presc, 3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			presc = sys.addNewPrescription(sys.findPatientByAMKA("1965654655"), sys.findDoctorByAAAE("3669"), new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2020"), 4);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("91091"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("99555"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("73286"), presc);
			presc = sys.addDrugToPrescription(sys.findDrugByCode("88825"), presc);
			sys.addPrescription(presc, 4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int userOption = 0;
		StandardInputRead reader = new StandardInputRead();
		while (userOption!=8){ 
			 printMenu();
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
	            String AMKA, patFName, patLName, drugName, drugCode, docLName, docFName, AAAE, specialty;
	            double drugCost;
	            int numOfDrugs;
	            Date startDate, endDate;
	            DatePeriod period;
	            switch (userOption) {
	            
	            case 0:
	            	continue;
	            
	            case 1:
	            	AMKA = reader.readString("Give the patient's AMKA: ");
	            	patFName = reader.readString("Give the patient's first name: ");
	            	patLName = reader.readString("Give the patient's last name: ");
	            	sys.addNewPatient(AMKA, patFName, patLName);
	            	reader.readString("Press any key to continue...");
	                break;
	            
	            case 2:
	            	drugCode = reader.readString("Give the drug's code: ");
	            	drugName = reader.readString("Give the drug's name: ");
	            	drugCost = reader.readPositiveFloat("Give the drug's cost: ");
	            	sys.addNewDrug(drugCode, drugName, drugCost);
	            	reader.readString("Press any key to continue...");
	                break;
	            
	            case 3:
	            	AAAE = reader.readString("Give the doctor's AAAE: ");
	            	docFName = reader.readString("Give the doctor's first name: ");
	            	docLName = reader.readString("Give the doctor's last name: ");
	            	specialty = reader.readString("Give the doctor's specialty: ");
	            	sys.addNewDoctor(AAAE, docFName, docLName, specialty);
	            	reader.readString("Press any key to continue...");
	                break;
	            
	            case 4:
	        		AMKA = reader.readString("Give the patient's AMKA: ");
	        		docFName = reader.readString("Give the doctor's first name: ");
	        		docLName = reader.readString("Give the doctor's last name: ");
	        		startDate = reader.readDate("Give the starting date: ");
	        		numOfDrugs = reader.readPositiveInt("Give the number of drugs: ");
	        		Prescription pres = sys.addNewPrescription(sys.findPatientByAMKA(AMKA), sys.findDoctorByName(docFName, docLName), startDate, numOfDrugs);
	        		for (int i = 0; i < numOfDrugs; i++) {
	        			drugName = reader.readString("Give drug: ");
	        			pres = sys.addDrugToPrescription(sys.findDrugByName(drugName), pres);
	        		}
	        		sys.addPrescription(pres, numOfDrugs);
	        		reader.readString("Press any key to continue...");
	                break;
	           
	            case 5:
	            	int usOption = 0;
	        		while (usOption!=5){ 
	        			 printPrescriptionsSubmenu();
	        	         String usInput = reader.readString("Which prescriptions would you like to print? ");
	        	            if (usInput == null) {
	        	                continue;
	        	            } else {
	        	                try {
	        	                    usOption = Integer.parseInt(usInput);
	        	                } catch (NumberFormatException ex) {
	        	                    usOption = 0;
	        	                }
	        	            }
	        	            switch (usOption) {
	        	            case 0:
	        	            	continue;
	        	            case 1:
	        	            	AMKA = reader.readString("Give the patient's AMKA: ");
	        	            	sys.printPatientPresciptions(sys.findPatientByAMKA(AMKA));
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 2:
	        	                startDate = reader.readDate("Give the starting date: ");
	        	                endDate = reader.readDate("Give the expiration date: ");
	        	                period = new DatePeriod(startDate, endDate); 
	        	                sys.printPeriodPrescriptions(period);
	        	                reader.readString("Press any key to continue...");
	        	                break;
	        	            case 3:
	        	            	AAAE = reader.readString("Give the doctor's AAAE: ");
	        	            	sys.printDoctorPresciptions(sys.findDoctorByAAAE(AAAE));
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 4:
	        	            	drugCode = reader.readString("Give the drug's code: ");
	        	            	sys.printDrugPresciptions(sys.findDrugByCode(drugCode));
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 5:    
	        	                System.out.println("Thanks for using the Prescription System Console...");
	    	                    break;	                
	    	                default:	                    
	    	                    System.out.println("User option " + usOption + " ignored...");
	    	                    continue;  	
	        	            }
	        		}
	        		break;
	            	
	            case 6:
	            	int uOption = 0;
	        		while (uOption!=5){ 
	        			 printCataloguesSubmenu();
	        	         String uInput = reader.readString("Which catalogue would you like to print? ");
	        	            if (uInput == null) {
	        	                continue;
	        	            } else {
	        	                try {
	        	                    uOption = Integer.parseInt(uInput);
	        	                } catch (NumberFormatException ex) {
	        	                    uOption = 0;
	        	                }
	        	            }
	        	            switch (uOption) {
	        	            case 0:
	        	            	continue;
	        	            case 1:
	        	            	sys.printPatientsCatalogue();
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 2:
	        	            	sys.printDrugsCatalogue();
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 3:
	        	            	sys.printDoctorsCatalogue();
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 4:
	        	            	sys.printPrescriptionsCatalogue();
	        	            	reader.readString("Press any key to continue...");
	        	                break;
	        	            case 5:    
	        	                System.out.println("Thanks for using the Prescription System Console...");
	    	                    break;	                
	    	                default:	                    
	    	                    System.out.println("User option " + uOption + " ignored...");
	    	                    continue;    
	        	            }
	        		}
	        		break;
	            
	            case 7:
	            	AMKA = reader.readString("Give the patient's AMKA: ");
	            	sys.deletePatient(sys.findPatientByAMKA(AMKA));
	            	reader.readString("Press any key to continue...");
	                break;
	            }
		}
	}
		
	
	public static void printMenu() {
        System.out.println("                 System Console");
        System.out.println("=======================================================");
        System.out.println("1. Insert patient......................................");
        System.out.println("2. Insert drug.........................................");
        System.out.println("3. Insert doctor.......................................");        
        System.out.println("4. Insert prescription................................."); 
        System.out.println("5. Find and print certain prescriptions................");
        System.out.println("6. Print a catalogue of your choice....................");
        System.out.println("7. Delete patient......................................");
        System.out.println("8. Exit................................................");
        System.out.println("=======================================================");
    }
	
	public static void printPrescriptionsSubmenu() {
		System.out.println("=======================================================");
		System.out.println("1. A patient's prescriptions...........................");
		System.out.println("2. Prescriptions of a specific time period.............");
		System.out.println("3. Prescriptions from a specific doctor................");
		System.out.println("4. Prescriptions with a specific drug..................");
		System.out.println("5. Exit................................................");
		System.out.println("=======================================================");
	}
	
	public static void printCataloguesSubmenu() {
		System.out.println("=======================================================");
		System.out.println("1. Patients' catalogue.................................");
		System.out.println("2. Drugs' catalogue....................................");
		System.out.println("3. Doctors' catalogue..................................");
		System.out.println("4. Prescriptions' catalogue............................");
		System.out.println("5. Exit................................................");
		System.out.println("=======================================================");
	}
}
