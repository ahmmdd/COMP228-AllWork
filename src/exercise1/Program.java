package exercise1;

import java.util.Scanner;
/**
 * Exercise #1 (5 marks):
 * 
 * Create a class <Patient> that contains instance variables for <patientId>, 
 * <firstName>, <lastName>, <address>, <city>, <province>, <postalCode>. Provide
 * a multiple argument constructor to allow the initialization of data. Provide 
 * all <getter> and <setter> methods. Provide also an empty (default) constructor. 
 * Provide a <getPatientInfo> method to return patient's data in a nicely 
 * formatted string.
 * 
 * Write a driver class to test class Patient. Let the user enter patient's 
 * data. Display the results in the console window.
 * 
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date Friday, September 25, 2015
 * 
 */
public class Program {
	public static Patient patient;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		patient = new Patient();
		
		//Prompt for Patient ID
		System.out.print("Enter Patient ID: ");
		String patientId = input.nextLine();
		patient.setPatientId(patientId);
		
		//Prompt for First Name
		System.out.print("Enter First Name: ");
		String firstName = input.nextLine();
		patient.setFirstName(firstName);
		
		//Prompt for Last Name
		System.out.print("Enter Last Name: ");
		String lastName = input.nextLine();
		patient.setLastName(lastName);
		
		//Prompt for Address
		System.out.print("Enter Address: ");
		String address = input.nextLine();
		patient.setAddress(address);

		//Prompt for City
		System.out.print("Enter City: ");
		String city = input.nextLine();
		patient.setCity(city);

		//Prompt for Province
		System.out.print("Enter Province: ");
		String province = input.nextLine();
		patient.setProvince(province);

		//Prompt for Postal Code
		System.out.print("Enter Postal Code: ");
		String postalCode = input.nextLine();
		patient.setPostalCode(postalCode);
		
		patient.getPatientInfo();
		
	}//End Main
}//End Class Program

