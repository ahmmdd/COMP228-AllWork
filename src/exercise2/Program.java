package exercise2;

import java.util.Scanner;

/**
 * Exercise #2 (5 marks):
 *  
 * In this exercise you will develop a Java application that allows the user to 
 * process account information.  Create a class named <BankAccount>. A bank 
 * account contains information about <accountNumber>, <ownersName>, and the 
 * <balance>. Provide a <constructor> that allows the user to initialize account 
 * data. Provide all <getter> methods. Provide the <setter> methods that allow 
 * the user to <withdraw> or <deposit> money. Provide a <getAccountInfo> method
 * to return account information in a nicely formatted string.
 * 
 * Write a driver class to test the bank account. The driver class (main class)
 * interacts with the user and calls <BankAccount> methods to initialize or 
 * update the account.
 * 
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date Friday, September 25, 2015
 * 
 */
public class Program {
	public static BankAccount account;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		account = new BankAccount();
		System.out.print("Enter amount to Deposit: ");
		double dep = Double.parseDouble(input.nextLine());
		account.deposit(dep);
		System.out.print("Enter amount to Withdraw: ");
		double with = Double.parseDouble(input.nextLine());
		account.withdraw(with);
		System.out.println("Total Balance is: " + account.getBalance());
	}//End main
}//End class

