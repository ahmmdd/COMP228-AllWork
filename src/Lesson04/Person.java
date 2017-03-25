package Lesson04;

public class Person {
	//PRIVATE INSTANCE VARIABLES
	private int _age;
	private boolean _isValid = false;

	// GET / ACCESSOR METHOD for age
	public int getAge() {
		return _age;
	}

	// GET / ACCESSOR METHOD for isValid
	public boolean getIsValid() {
		return this._isValid;
	}

	// SET / MUTATOR METHOD for age
	public void setAge(String ageString) {
		
		try {
			int age = Integer.parseInt(ageString);
			
			if(age < 0) {
				System.out.println("Please enter a positive number");
			}
			else {
				this._age = age;
				this._isValid = true;
			}
		} catch (Exception exception) {
			System.out.println("Please enter an integer value");
		}
	}
	
	// EMPTY CONSTRUCTOR
	Person() {}
	
	// Overriding  the toString Method
	public String toString() {
		return "\nYou Entered: " + this._age;
		
	}
}