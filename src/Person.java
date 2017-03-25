
public class Person {
	private String _gender;
	private String _name;
	private int _age;
	/*PROPERTIES+++++++++++++++++++++++++++++*/
	public String getGender() {
		return _gender;
	}
	public void setGender(String gender) {
		this._gender = gender;
	}
	
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	
	/*CONSTRUCTOR++++++++++++++++++++++++++++*/
	public Person(int age){
		this._age = age;
		
	}
	/*PUBLIC METHODS ++++++++++++++++++++++*/
	public void runs(){
		System.out.println(this._name+" Runs");
		
	}
}
