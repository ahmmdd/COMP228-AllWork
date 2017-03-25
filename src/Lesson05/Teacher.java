package Lesson05;
// TEACHER CLASS
public class Teacher extends Resident implements SchoolID {
	private String _schoolID;
	// CONSTRUCTOR
	Teacher(String name, int age, float heightInInches, float massInPounds,
			String SIN) {
		super(name, age, heightInInches, massInPounds, SIN);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;
		
	}
	


}