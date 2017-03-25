package Lesson05;
import java.util.ArrayList;

// STUDENT CLASS
public class Student extends Resident implements SchoolID {
	// PRIVATE INSTANCE VARIABLES
	private String _studentID;
	private String _schoolID;
	private ArrayList<Course> _courses=new ArrayList<Course>();
	
	// CONSTRUCTOR
	Student(String name, int age, float heightInInches, float massInPounds,
			String SIN, String studentID) {
		super(name, age, heightInInches, massInPounds, SIN);
		this._studentID = studentID;
	}
	
	public void addCourse(String courseCode, String courseName, String courseDescription, double courseCost) {
		this._courses.add(new Course(courseCode, courseName, courseDescription, courseCost));
	}
	
	public void dropCourse(String courseName ) {
		int index = -1;
		// enhanced for loop - equivalent to a foreach in C#
		for (Course course : this._courses) {
			if(course.getName() == courseName) {
				index = this._courses.indexOf(course);
			}
		}
		if(index >= 0) {
			this._courses.remove(index);
		}
		
	}

	@Override
	public String toString() {

		String output = "";
		 output += "Student Name: " + this._name + " StudentID: " + this._studentID + "\n";
		 
		 if(this._courses.size() > 0) {
			 output += "Courses\n";
			 output += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
			 
			 for (Course course : this._courses) {
				output += course.getName() + "\n";
			}
			 
			 output += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
		 }
		 
		 return output;
	}

	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;
		
	}


	
	

}