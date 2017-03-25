package Lesson04;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Person person = new Person();
		String prompt = "";
		
		
		do {
			System.out.println("Please Make a Selection: ");
			System.out.println("-------------------------");
			System.out.println("1. Enter Your Age");
			System.out.println("2. Exit");
			System.out.println("-------------------------");
			
			Scanner input = new Scanner(System.in);
			prompt = input.nextLine();
			
			switch (prompt) {
			case "1":
				SetAge(person);
				break;
			case "2":
				break;
			}
			
		} while (!prompt.equals("2"));
		
	}

	// set person's age
	private static void SetAge(Person person) {
		while (!person.getIsValid()) {
			Scanner input = new Scanner(System.in); // create input scanner
				
			System.out.println("Please enter your age: ");
			person.setAge(input.nextLine()); 
			
			if(person.getIsValid()) {
				System.out.println(person.toString());
			}
			else {
				System.out.println();
			}	
		}
	}
	

}