/**
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date November 11, 2015
 * 
 * Airline Reservations System. 
 * ----------------------------
 * A small airline has just purchased a computer for its new 
 * automated reservations system. You have been asked to develop 
 * the new system. You’re to write an app (Console or GUI) to 
 * assign seats on each flight of the airline’s only plane 
 * (capacity: 10 seats) (14 Marks: Functionality).
 * 
 * a. Display the following alternatives in a Console-based menu 
 *    (or appropriate UI component): 1 for First Class, 2 for 
 *    Economy, 3 for Exit. You must use a switch statement and a 
 *    while loop (4 Marks: Functionality) 
 *    
 * b. If the user selects option 1, your app should assign a seat 
 *    in the first-class section (seats 1–5). If the user selects 
 *    option 2, your app should assign a seat in the economy 
 *    section (seats 6–10). Use a one-dimensional array of type 
 *    bool (or an alternate ArrayList structure) to represent the
 *    seats chart of the plane (2 Marks: Functionality).
 *    
 * c. Initialize all the elements of the array to false to 
 *    indicate that all the seats are empty (or for an ArrayList 
 *    structure, allocate the appropriate number of elements for 
 *    First class seats and Economy seats.) (2 Marks: Functionality).
 * 
 * d. As each seat is assigned, set the corresponding element of 
 *    the array to true to indicate that the seat is no longer 
 *    available (for an ArrayList structure, remove the seat from 
 *    list). (2 Marks: Functionality).
 * 
 * e. Your app should never assign a seat that has already been 
 *    assigned. When the economy section is full, your app should 
 *    ask the person if it’s acceptable to be placed in the first 
 *    class section (and vice versa). If yes, make the appropriate 
 *    seat assignment. If no, display the message "Next flight 
 *    leaves in 3 hours." (4 Marks: Functionality).
 */
package exersice2;

public class Program {
	public static void main(String[] args){
		AirlineReservation bookSeats = new AirlineReservation();
		bookSeats.start();
	}
}
