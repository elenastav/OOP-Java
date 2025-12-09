// Maragkou Sofia
// AM: 2012030078


package objects;
import java.util.Random;
import java.util.Date;
public class MainFunction {

	
	public static void main(String[] args) {
		// καθορισμός μέγιστου μεγέθους για τον κάθε πίνακα
		final int maxDoctors= 50;
		final int maxMedicines= 100;
		final int maxPatients= 100;
		final int maxPrescriptions= 100;
		
		// καθορισμός σταθεράς εξόδου
		final int EXIT=6;
		
		//
		StandardInputRead sir = new StandardInputRead();
		
		// χρησιμοποιείται για την δημιουργία τυχαίων κωδικών
		Random rand = new Random(); 
		
		
		Doctor[] doctors= new Doctor[maxDoctors];
		int counterDoctors=0;
		
		Medicine[] medicines= new Medicine[maxMedicines];
		int counterMedicines=0;
		
		Patient[] patients= new Patient[maxPatients];
		int counterPatients=0;
		
		Prescription[] prescriptions= new Prescription[maxPrescriptions];
		int counterPrescriptions=0;
		
		
		// επιλογή βασικού μενού
		int choise1=0;
		// επιλογή υπομενού
		int choise2=0;
		
		
		// ο βρόγχος θα συνεχίσει να δουλεύει μέχρι ο χρήστης να εισάγει τον αριθμό εξόδου 
		while(choise1!=EXIT){
		
			// βασικό μενού
			
			System.out.println("1. Insert the pharmacy");
			System.out.println("2. Insert extra informations");
			System.out.println("3. Erase informations");
			System.out.println("4. Search for a prescription");
			System.out.println("5. Print informations about a category");
			System.out.println("6. Exit the program");
			choise1 = sir.readPositiveInt("Insert your choise");
		
			switch(choise1){
			// εισαγωγή στοιχείων φαρμακείου 
			case 1:
				Pharmacy pharmacyUser =new Pharmacy();
				pharmacyUser.setOwnersFirstName(sir.readString("First name:"));
				pharmacyUser.setOwnersLastName(sir.readString("Last name:"));
				pharmacyUser.setTel(sir.readString("Telephone number:"));
				pharmacyUser.setPharmTown(sir.readString("Town:"));
				pharmacyUser.setPharmSteet(sir.readString("Street:"));
				pharmacyUser.setPharmNum(sir.readString("Address number:"));
				break;
			// εισαγωγή στοιχείων γιατρού, φαρμάκου, ασθενή, συνταγής
			case 2:
				// δεύερο μενού, επιλογή είδους εισαγωγής
				System.out.println();
				System.out.println("1. Insert a doctor");
				System.out.println("2. Insert a medicine");
				System.out.println("3. Insert a patient");
				System.out.println("4. Insert a prescription");
				System.out.println("5. EXIT");
				choise2 = sir.readPositiveInt("Enter your choise");
				
				switch(choise2){
				//εισαγωγή στοιχείων γιατρού
				case 1:
					if (counterDoctors<maxDoctors){
						doctors[counterDoctors]= new Doctor();
						doctors[counterDoctors].setDoctorFirstName(sir.readString("First name:"));
						doctors[counterDoctors].setDoctorLastName(sir.readString("Last name:"));
						if (counterDoctors!=0){
							// έλεγχος για να μην δωθεί ο ίδιος κωδικός 
							int flag=0;
							do{
								doctors[counterDoctors].setDoctorCode(Math.abs(rand.nextInt()));
								int counter=0;
								while(flag==0 && counter<=counterDoctors-1){
									if(doctors[counter].getDoctorCode()==doctors[counterDoctors].getDoctorCode())
										flag=1;
									counter++;
								}
							}while(flag==1);
							
						}else{
							doctors[counterDoctors].setDoctorCode(Math.abs(rand.nextInt()));
						}
						System.out.println("AM:"+doctors[counterDoctors].getDoctorCode());
						counterDoctors++;
						
					}else{
						System.out.println("Memory if full");
					}
					break;
				// εισαγωγή στοιχείων φαρμάκου
				case 2:
					if (counterMedicines<maxMedicines){
						medicines[counterMedicines]=new Medicine();
						medicines[counterMedicines].setMedicineName(sir.readString("Name:"));
						if(counterMedicines!=0){
							// έλεγχος για να μην δωθεί ο ίδιος κωδικός
							int flag=0;
							do{
								medicines[counterMedicines].setMedicineCode(Math.abs(rand.nextInt()));
								int counter=0;
								while(flag==0 && counter<=counterMedicines-1){
									if(medicines[counter].getMedicineCode()==medicines[counterMedicines].getMedicineCode())
										flag=1;
									counter++;
								}
							}while(flag==1);
						}else{
							medicines[counterMedicines].setMedicineCode(Math.abs(rand.nextInt()));
						}
						medicines[counterMedicines].setMedicinePrice(sir.readPositiveFloat("Price:"));
						System.out.println("code:"+medicines[counterMedicines].getMedicineCode());
						counterMedicines++;
					}else{
						System.out.println("Memory if full");
					}
					break;
				// εισαγωγή στοιχείων ασθενή
				case 3:
					if (counterPatients<maxPatients){
						patients[counterPatients]=new Patient();
						patients[counterPatients].setPatientFirstName(sir.readString("First name:"));
						patients[counterPatients].setPatientLastName(sir.readString("Last name:"));
						if (counterPatients!=0){
							// έλεγχος για να μην δωθεί ο ίδιος κωδικός
							int flag=0;
							do{
								patients[counterPatients].setPatientAmka(Math.abs(rand.nextInt()));
								int counter=0;
								while(flag==0 && counter<=counterPatients-1){
									if(patients[counter].getPatientAmka()==patients[counterPatients].getPatientAmka())
										flag=1;
									counter++;
								}
							}while(flag==1);
						}else{
							patients[counterPatients].setPatientAmka(Math.abs(rand.nextInt()));
						}
						System.out.println("AMKA:"+patients[counterPatients].getPatientAmka());
						counterPatients++;
						
						
					}else{
						System.out.println("Memory if full");
					}
					break;
				// εισαγωγή στοιχείων συνταγής
				case 4:
					if (counterPrescriptions<maxPrescriptions){
						if (doctors[0]!=null & patients[0]!=null & medicines[0]!=null){
							prescriptions[counterPrescriptions]=new Prescription();
							
							// εισαγωγή γιατρού
							int flag=-1;   // με αυτήν την αρχικοποίηση, δίνει ταυτόχρονα και αν βρέθηκε και την θέση του στοιχείου
							do{  		   // μεχρι να βρει ότι υπάρχει τέτοιος γιατρός
								int DoctorofPrescription=sir.readPositiveInt("Enter the AM of the doctor:");
								int counter=0;
								do{       
									if (DoctorofPrescription==doctors[counter].getDoctorCode())
										flag=counter;
									else
										counter++;
								}while (flag!=counter & counter<counterDoctors);
								if (flag!=counter)
									System.out.println("There is no doctor with this AM");
							}while(flag<0 );
							prescriptions[counterPrescriptions].setDoctor(doctors[flag]);
							
							// εισαγωγή ασθενή
							flag=-1;
							do{
								int PatientofPrescription=sir.readPositiveInt("Enter the AMKA of the patient: ");
								int counter=0;
								do{
									if (PatientofPrescription==patients[counter].getPatientAmka())
										flag=counter;
									else 
										counter++;
								}while(flag!=counter & counter<counterPatients);
								if (flag!=counter)
									System.out.println("There is no patient with this AMKA");
							}while (flag<0);
							prescriptions[counterPrescriptions].setPatient(patients[flag]);
							// εισαγωγή φαρμάκων
							int num;
							do{
								num=sir.readPositiveInt("Enter the number of the medicines:");
							}while(num<0 & num>6);
							prescriptions[counterPrescriptions].setNumberOfMedicines(num);
							for (int counter1=0;counter1<=prescriptions[counterPrescriptions].getNumberOfMedicines()-1;counter1++){
								flag=-1;
								do{
									
									int medicine=sir.readPositiveInt("Enter the code of the medicine:");
									int counter=0;
									do{
										if (medicine==medicines[counter].getMedicineCode())
											flag=counter;
										else
											counter++;
									}while(flag!=counter);
								}while (flag<0);
								prescriptions[counterPrescriptions].setPrescriptionMedicines(medicines[flag],counter1);
								float dosage=sir.readPositiveInt("Enter the dosage of the medicine:");
								prescriptions[counterPrescriptions].setDosage(counter1, dosage);
							}	
							prescriptions[counterPrescriptions].setDate(sir.readDate("Enter the date:"));
							counterPrescriptions++;
						}else{
							System.out.println("Fullfil the other categories");
						}
					}else{
						System.out.println("Memory if full");
					}
					break;
				default:
					break;
				}
				break;
			// διαγραφή στοιχείων γιατρού, φαρμάκου, ασθενή, συνταγής
			case 3:
				// 
				System.out.println();
				System.out.println("1. Erase a doctor");
				System.out.println("2. Erase a medicine");
				System.out.println("3. Erase a patient");
				System.out.println("4. Erase a prescription");
				System.out.println("5. EXIT");
				choise2 = sir.readPositiveInt("Enter your choise");
				switch(choise2){
				// διαγραφή γιατρού
				case 1:
					//  εισάγει το ΑΜ του γιατρού και ελέγχει αν υπάρχει στον πίνακα των γιατρών
					// ώστε να το διαγράψει 
					int counter=0;
					int AM=sir.readPositiveInt("Enter the AM:");
					     
					while((counter<counterDoctors) &&(AM!=doctors[counter].getDoctorCode()))
						counter++;
						
					if (counter<counterDoctors){
						for(int k = counter; k < counterDoctors-1; k++)
							doctors[k] =doctors[k+1];   

						doctors[counterDoctors-1]=null;  
						counterDoctors--; 
					}
					break;
				// διαγραφή φαρμάκου
				case 2:
				//  εισάγει τον κωδικό του φαρμάκου και ελέγχει αν υπάρχει στον πίνακα 
					// ώστε να το διαγράψει 
					int i=0;
					int code=sir.readPositiveInt("Enter the code:");
					
					while((i<counterMedicines) &&(code!=medicines[i].getMedicineCode()))
						i++;
						
					if (i<counterMedicines){
						for(int k = i; k < counterMedicines-1; k++)
							medicines[k] =medicines[k+1];   

						medicines[counterMedicines-1]=null;  
						counterMedicines--; 					
					}
					break;
				// διαγραφή ασθενή
				case 3:
					//  εισάγει το ΑΜΚΑ του ασθενή και ελέγχει αν υπάρχει στον πίνακα 
					// ώστε να το διαγράψει 
					int count=0;
					int AMKA=sir.readPositiveInt("Enter the AMKA:");
					
					while((count<counterPatients) &&(AMKA!=patients[count].getPatientAmka()))
						count++;
						
					if (count<counterPatients){
						for(int k = count; k < counterPatients-1; k++)
							patients[k] =patients[k+1];   

						patients[counterPatients-1]=null;  
						counterPatients--; 
					}
					break;
				
				//διαγραφή συνταγής
				case 4:
					int choise3;
					for (int count1=0; count1<counterPrescriptions; count1++){
						System.out.println("Prescription number " + (count1+1) );
						prescriptions[count1].prescriptionPrint();
					}
					do{
						choise3=sir.readPositiveInt("Enter your choise");
					}while(choise3<0 & choise3>counterPrescriptions);
										
					
						for(int count2 = choise3; count2 < counterPrescriptions-1; count2++)
							prescriptions[count2-1] =prescriptions[count2];   

						prescriptions[counterPrescriptions-1]=null;  
						counterPrescriptions--; 
					break;
				default:
					break;
				}
				break;
			// εύρεση συνταγής
			case 4:
				//
				System.out.println();
				System.out.println("1. Search by the doctors last name");
				System.out.println("2. Search by the patients AMKA");
				System.out.println("3. Search by time range");
				System.out.println("4. EXIT");
				choise2 = sir.readPositiveInt("Enter your choise");
				
				switch (choise2){
				case 1:
					String nameOfDoctor=sir.readString("Enter the last name of the doctor");
					for (int counter=0; counter <counterPrescriptions;counter++){
						if (nameOfDoctor.equals(prescriptions[counter].getDoctor().getDoctorLastName()))
							prescriptions[counter].prescriptionPrint();
					}
					break;
				case 2:
					int amkaOfPatient=sir.readPositiveInt("Enter the AMKA of the patient");
					for (int counter=0;counter<counterPrescriptions;counter++){
						if (amkaOfPatient==prescriptions[counter].getPatient().getPatientAmka())
							prescriptions[counter].prescriptionPrint();
					}
					break;
				case 3:
					Date firstDate;
					Date secondDate;
					
						firstDate=sir.readDate("Enter the a date");
						secondDate=sir.readDate("Enter a second date");
						
					for (int counter=0; counter<counterPrescriptions;counter++){
						if (prescriptions[counter].getDate().after(firstDate) & prescriptions[counter].getDate().before(secondDate))
							prescriptions[counter].prescriptionPrint();
					}
					break;
				default:
					break;
				}
				break;
			// εκτύπωση στοιχείων 
			case 5:
				// 
				System.out.println();
				System.out.println("1. Doctors");
				System.out.println("2. Medicines");
				System.out.println("3. Patients");
				System.out.println("4. Prescriptions");
				choise2 = sir.readPositiveInt("Select the kind of the insertion");
				switch (choise2){
				// εκτύπωση γιατρών
				case 1:
					if (doctors[0]!=null){
						for (int counter=0; counter<counterDoctors;counter++){
							doctors[counter].doctorPrint();
						}
					}else {
						System.out.println("No items found");
					}
					break;
				// εκτύπωση φαρμάκων
				case 2:
					if (medicines[0]!=null){
						for (int counter=0; counter<counterMedicines ;counter++){
							medicines[counter].medicinePrint();
						}
					}else{
						System.out.println("No items found");
					}
					break;
				// εκτύπωση ασθενών
				case 3:
					if (patients[0]!=null){
						for (int counter=0; counter<counterPatients; counter++){
							patients[counter].patientPrint();
						}
					}else {
						System.out.println("No items found");
					}
					break;
				// εκτύπωση συνταγών
				case 4:
					if (prescriptions[0]!=null){
						for (int counter=0; counter<counterPrescriptions; counter++){
							prescriptions[counter].prescriptionPrint();
						}
					}else {
						System.out.println("No items found");
					}
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			System.out.println();
		}
	}

}
