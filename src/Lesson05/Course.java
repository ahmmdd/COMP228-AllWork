package Lesson05;
// Course Class
public class Course {
	// PRIVATE INSTANCE VARIABLES
	private String _code;
	private String _name;
	private String _description;
	private double _cost;
	
	// GETTERS & SETTERS
	
	// Read Course Name
	public String getName() {
	 return this._name;
	}
	
	// CONSTRUCTOR
	public Course(String code, String name, String description, double cost) {
		this._code = code;
		this._name = name;
		this._description = description;
		this._cost = cost;
	}
	
	
}