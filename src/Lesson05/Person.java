package Lesson05;
// Super that we'll use for this example
public abstract class Person {
	// PRIVATE INSTANCE VARIABLES
		protected int _age;
		protected String _name;
		protected float _heightInInches;
		protected float _massInPounds;
		
		// GETTERS AND SETTERS (PROPERTIES)
		public int getAge() {
			return this._age;
		}

		public void setAge(int age) {
			this._age = age;
		}

		public String getName() {
			return this._name;
		}

		public void setName(String name) {
			this._name = name;
		}

		public float getHeightInInches() {
			return this._heightInInches;
		}

		public void setHeightInInches(float heightInInches) {
			this._heightInInches = heightInInches;
		}

		public float getMassInPounds() {
			return this._massInPounds;
		}

		public void setMassInPounds(float massInPounds) {
			this._massInPounds = massInPounds;
		}

		// CONSTRUCTOR(S) ++++++++++++++++++++++++++++
		Person(String name, int age, float heightInInches, float massInPounds) {
			this._name = name;
			this._age = age;
			this._heightInInches = heightInInches;
			this._massInPounds = massInPounds;
		}
		
		// PUBLIC METHODS
		public void eats() {
			System.out.println(this._name + " is eating");
		}
		
		public void walks() {
			System.out.println(this._name + " is walking");
		}
		
		public void speaks() {
			System.out.println(this._name + " is speaking");
		}
}
