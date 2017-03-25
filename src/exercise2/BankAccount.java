package exercise2;
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
public class BankAccount {
	private String _accountNumber, _ownersName;
	private double _balance;

	/*+++++++++++++CONSTRUCTOR++++++++++++++*/
	public BankAccount(){
		this._balance = 0;
	}
	
	public String getAccountNumber() { return _accountNumber; }
	public void setAccountNumber(String accountNumber) { this._accountNumber = accountNumber; }
	
	public String getOwnersName() { return _ownersName; }
	public void setOwnersName(String ownersName) { this._ownersName = ownersName; }

	public double getBalance(){ return _balance; }
	public void setBalance(double balance){ this._balance = balance; }
	
	public BankAccount(double initialBalance){   
		this._balance = initialBalance;
	}
	public void deposit(double amount){  
		double newBalance = this._balance + amount;
		this._balance = newBalance;
	}

	public void withdraw(double amount){   
		double newBalance = this._balance - amount;
		this._balance = newBalance;
	}
}
