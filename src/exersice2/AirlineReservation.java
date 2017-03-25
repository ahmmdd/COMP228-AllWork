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

import java.util.Scanner;

public class AirlineReservation {
    boolean[] seats = new boolean[11]; // create 10 seat. Empty seat is false
    Scanner userInput = new Scanner(System.in);

    public void start(){       
        while (true){
        	makeReservation();
        }//End while   
    }//end Start

    public void makeReservation(){
    		System.out.println("Please type \n\t1. First Class \n\t2. Economy Class \n\t3. Exit");
    		int option = userInput.nextInt();
    		switch(option){
    		case 1:
    			firstClassSeat();
    			break;
    		case 2:
    			economySeat();
    			break;
    		case 3:
    			System.out.println("Have a Good Day!!!");
    			System.exit(0);
    		}//End switch(option)
    }// end makeReservation
    /* assign a first class seat*/
    public void firstClassSeat() {
        for ( int i = 1; i < 6; i++ ){
        	// if false, then a seat is available for assignment
            if ( seats[i] == false ){
                seats[i] = true;  // assign seat
                System.out.printf("First Class. Seat# %d\n", i);
                break;
            }else if ( seats[5] == true ){ // If seats[5] is true then first class is fully booked
                if ( seats[10] == true){ // If seats[10] is true then economy (and therefore whole flight) is fully booked
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }else{ // ask passenger if they would like an economy ticket instead
                    System.out.println("First Class is fully booked. Would you like Economy? \n\t1.Yes \n\t2. No");
                    int choice = userInput.nextInt();
                    switch(choice){
                    case 1:
                    	economySeat();
                        start();
                        break;
                    default:
                    	System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }//end switch(choice)
                }//end if/else for seats[5]
            }//end else/if for seats[10]
        }//end for
    }//End firstClassSeat

    /* assign an economy seat*/
    public void economySeat(){
        for ( int i = 6; i < 11; i++ ){
            if ( seats[i] == false ){ // if false, then a seat is available for assignment
                seats[i] = true; // assign seat
                System.out.printf("Economy. Seat# %d\n", i);
                break;
            }else if ( seats[10] == true ){ // If seats[10] is true then economy is fully booked
                if ( seats[5] == true){ // If seats[5] is true then first class (and therefore whole flight) is fully booked
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }else{
                    System.out.println("Economy is fully booked. Would you like First Class? \n\t1. Yes \n\t2. No");
                    int choice = userInput.nextInt();
                    switch(choice){
                    case 1:
                    	firstClassSeat();
                        start();
                        break;
                    default:
                    	System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }//end switch(choice)
                }//end if/else for seats[5]
            }//end if/else for seats[10]
        }//end for
    }//end economySeat
}//End Class