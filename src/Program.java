
public class Program {
	//7private static String _name = "";
	/*
	 * What is the default modifier for the class?
	 * 
	 * _name is instance variable.
	 * all private instance variable, and all private methods should start with
	 * underscore(_).
	 *  
	 */
	public static Person person;
	public static void main(String[] args) {
		System.out.println("Pragrammer Started...");
	/*	_name = "Mohammed";
		System.out.println(_name);
	*/
		person = new Person(25);
		
		person.setName("Mohammed");
		
		System.out.println(person.getName());
		
		person.runs();
		
	}

}
