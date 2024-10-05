package abc;

import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor:
 * Description: This program creates a a PatientDriverApp toe execute the program
 * Due: 10/04/2024
 * Platform/compiler: Eclipse IDE, Command line
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Gabriel Brock__
*/

public class PatientDriverApp {

	/* 
	 * Accessor Method to set procedure charges
	 */
	public static void main(String[] args) {
		
		// Create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This Program was developed by a student: ");
		System.out.println("Gabriel Brock 10/04/24 ");
		System.out.println();
		
		//Patient info
		//Enter Patient name
		System.out.print("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = keyboard.nextLine();
        System.out.print("Enter last name: ");
        String lastName = keyboard.nextLine();
                
        //Enter Address and phone info
        System.out.print("Enter street address: ");
        String streetAddress = keyboard.nextLine();
        System.out.print("Enter city: ");
        String city = keyboard.nextLine();
        System.out.print("Enter state: ");
        String state = keyboard.nextLine();
        System.out.print("Enter zip code: ");
        String zipCode = keyboard.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = keyboard.nextLine();
        
        //Enter Emergency contact info
        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = keyboard.nextLine();
        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = keyboard.nextLine();
        System.out.println();
        System.out.println();
        
        keyboard.close(); //Close the keyboard
        
        //Create a Patient object
		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode,
		phoneNumber, emergencyContactName, emergencyContactPhone);
		
		// Create three Procedure objects using different constructors
		Procedure procedure1 = new Procedure("Cortizone shot", "06/12/2023", "Dr. Johnson", 1500.75);
		Procedure procedure2 = new Procedure("MRI Scan", "06/15/2023");
		procedure2.setPractitionerName("Dr. Davis");
		procedure2.setProcedureCharges(2300.50);
		Procedure procedure3 = new Procedure();
		procedure3.setProcedureName("DVT - Surgery");
		procedure3.setProcedureDate("06/20/2023");
		procedure3.setPractitionerName("Dr. Anderson");
		procedure3.setProcedureCharges(3750.25);
		
		// Calculate total charges for the three procedures
		double totalCharge = calculateTotalCharge(procedure1, procedure2, procedure3);
		
		/*
		 *  Display patient information
		 */
		displayPatient(patient);
		System.out.println(); // Insert a blank line
		
		/*
		 * Display procedure information
		 */
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		System.out.printf("Total Charge: $%.2f\n", totalCharge);
		System.out.println(); // Insert a blank line
		
		//Print student information
		System.out.println("Student Name: Gabriel Brock");
		System.out.println("MC#: M21176115 ");
		System.out.println("Due Date: 10/04/2024 ");
		}
		
		/*
		 * Method to display Patient info
		 */
		public static void displayPatient(Patient patient) {
			System.out.println(patient);
			}
		/*
		 * Method to display procedure info
		 */
		public static void displayProcedure(Procedure procedure) {
			System.out.println(procedure);
			System.out.println(); // Insert a blank line
		    }
		/*
		 * Method to calculate total charges
		 */
		public static double calculateTotalCharge(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
			double totalCharge = procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
			return totalCharge;
	        }
		
		}
			
	
				