package Lesson05;
// PROGRAM DRIVER CLASS
public class Program {

	// STATIC MAIN METHOD ++++++++++++++++++++
	public static void main(String[] args) {
		Student student = new Student("Mike", 46, 72.0f, 175.0f, "555 555 555", "15MM12345");
		
		student.eats();
		student.setAddress("55", "Fifty-Fifth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());
		
		student.changeAddress("44", "Fourty-Fourth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());
		
		student.addCourse("COMP101", "Programming Fundamentals", "First Computer Course", 600.35);
		student.addCourse("COMP102", "Programming Design", "First UML Course", 600.35);
		//student.dropCourse("Programming Design");
		//student.dropCourse("Programming Fundamentals");
		student.dropCourse("Programming");
		System.out.println(student.toString());
	}

}