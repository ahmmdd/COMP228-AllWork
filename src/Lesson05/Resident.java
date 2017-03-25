package Lesson05;
// RESIDENT SUB CLASS OF THE PERSON SUPERCLASS
public abstract class Resident extends Person {
	//PRIVATE INSTANCE VARIABLES
	protected String _SIN;
	protected Address _address;
	
	//GETTERS AND SETTERS
	public String getSIN() {
	return this._SIN;
	}
	
	public void setAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address = new Address(streetNumber, streetName, cityName, provinceName);
	}
	
	public void changeAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address.change(streetNumber, streetName, cityName, provinceName);
	}
	
	public String getAddress() {
		try {
			return this._address.toString();
		} catch (Exception e) {
			return "Error: Address not initialized";
		}
		
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++
	Resident(String name, int age, float heightInInches, float massInPounds, String SIN) {
		super(name, age, heightInInches, massInPounds);
		this._SIN = SIN;
	}

}