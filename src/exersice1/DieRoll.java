/**
 * @author Mohammed Juned Ahmed
 * @author 300833356
 * @date November 10, 2015
 * 
 * Dice Rolling App. 
 * ----------------
 * Write an app to simulate the rolling of two dice and displaying 
 * how many times each result was rolled (10 Marks: Functionality).
 * 
 * a. The app should randomly roll the first die and the second die
 *    (2 Marks: Functionality).
 *    
 * b. The sum of the two values should then be calculated (2 Marks:
 *    Functionality).
 *    
 * c. Each die can show an integer value from 1 to 6, so the sum of
 *    the values will vary from 2 to 12, with 7 being the most 
 *    frequent sum and 2 and 12 the least frequent sums. The figure 
 *    below shows the 36 possible combinations of the two dice. Your 
 *    app should roll the dice 36,000 times (2 Marks: Functionality)
 *    
 * d. Use a one-dimensional array (or an ArrayList) to tally the 
 *    number of times each possible sum appears (2 Marks: 
 *    Functionality).
 *    
 * e. Display the results in list format to the console (or using a
 *    GUI window) showing how many times each number was rolled 
 *    (2 Marks: Functionality).
 */
package exersice1;
import java.util.Random;

public class DieRoll {
	public static void main( String[] args){
        Random randNumbers = new Random();
        int[] array = new int[13];
        int die1, die2, dieSum;
         
        //Roll the die 36,000 times
        for(int i = 0; i < 36000; i++){
            die1 = 1 + randNumbers.nextInt(6);
            die2 = 1 + randNumbers.nextInt(6);
            dieSum = die1 + die2;
            ++array[dieSum];
        }
        System.out.printf("%s%13s\n", "  Sum", "Frequency");
         
        // Outputs array values
        for(int i = 2; i < array.length; i++){
            System.out.printf("%4d%10d\n", i, array[i]);
        }
    } // End main
}// End class
