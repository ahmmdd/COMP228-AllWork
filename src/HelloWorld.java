import java.util.Scanner;
/**

 * Hello World Program.
 * 
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date September 09, 2015
 */
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.printf("%s %s%n","Hello","World");//formating sequence string interpolation
		String myName = "";
		float myNumber = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		myName = input.next();
		System.out.printf("Your Name is: %s", myName);
		System.out.println("\n");
		System.out.print("Rate this program from 1 to 10: ");
		myNumber = input.nextFloat();
		System.out.printf("Your Rating is: %.2f", myNumber);
	}

}
