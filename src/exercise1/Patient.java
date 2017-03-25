package exercise1;
/**
 * Exercise #1 (5 marks):
 * 
 * Create a class <Patient> that contains instance variables for <patientId>, 
 * <firstName>, <lastName>, <address>, <city>, <province>, <postalCode>. Provide
 * a multiple argument constructor to allow the initialization of data. Provide 
 * all <getter> and <setter> methods. Provide also an empty (default) constructor. 
 * Provide a <getPatientInfo> method to return patient's data in a nicely 
 * formatted string.
 * 
 * Write a driver class to test class Patient. Let the user enter patient's 
 * data. Display the results in the console window.
 * 
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date Friday, September 25, 2015
 * 
 */
public class Patient {
	/*+++++++++++++++++++INSTANCE VARIABLES++++++++++++++++++++++++++*/
	private String _patientId, _firstName, _lastName, _address, _city, _province, _postalCode;
	/*+++++++++++++++++++PROPEERTIES++++++++++++++++++++++++++*/
	public String getPatientId() {	return _patientId; }
	public void setPatientId(String patientId) { this._patientId = patientId; }
	
	public String getFirstName() {	return _firstName; }
	public void setFirstName(String firstName) { this._firstName = firstName; }
	
	public String getLastName() { return _lastName; }
	public void setLastName(String lastName) {	this._lastName = lastName; }
	
	public String getAddress() { return _address; }
	public void setAddress(String address) { this._address = address; }
	
	public String getCity() { return _city; }
	public void setCity(String city) { this._city = city; }

	public String getProvince() { return _province; }
	public void setProvince(String province) { this._province = province; }

	public String getPostalCode() { return _postalCode; }
	public void setPostalCode(String postalCode) { this._postalCode = postalCode; }
	/*+++++++++++++++++++CONSTRUCTOR++++++++++++++++++++++++++*/
	public Patient(){ }
	/*+++++++++++++++++++PUBLIC METHODS++++++++++++++++++++++++++*/
	public void getPatientInfo(){
//		System.out.println("Patient ID | First Name | LastName | Address | City | Province | Postal Code ");
		System.out.printf(" %s\t%s\t%s\t%s\t%s\t%s\t%s\t",this._patientId, this._firstName, this._lastName, this._address, this._city, this._province, this._postalCode);
		//System.out.println(this._patientId + "|" + this._firstName + "|" + this._lastName + "|" + this._address + "|" + this._city + "|" + this._province + "|" + this._postalCode);
	}// End getPatientInfo
}// End Class Patient
