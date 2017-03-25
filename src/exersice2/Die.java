package exersice2;

import javax.swing.JOptionPane;
/**
 * 
 * @author Mohammed Ahmed
 * @author 300833356 
 */
public class Die {
	public static void main(String[] args){
		boolean guessNotOver = true;
		JOptionPane.showMessageDialog( null, "Welcome to the dice game!" );
		JOptionPane.showMessageDialog( null, "You will be allowed to roll the dice 3 times!" );
		String guessedNumber = JOptionPane.showInputDialog( null, "Enter a number between 2 to 12 to guess." );
		int guess = 0;
		try{
			guess = new Integer(guessedNumber);
		}catch(Exception e){
			JOptionPane.showMessageDialog( null, "Incorrect Guess!!");
			System.exit(0);
		}
		//begin guess loop
		do{
			if ( guess< 2 || guess> 12 ){
				guessedNumber = JOptionPane.showInputDialog( null, "Please enter a number only between 2 to 12 to guess." );
				try{
					guess = new Integer(guessedNumber);
				}catch(Exception e){
					JOptionPane.showMessageDialog( null, "Incorrect Guess!!");
					System.exit(0);
				}
			}else{
				guessNotOver = false;
			}
		}while(guessNotOver);
		//begin to roll dice thrice
		for (int i=1; i<4; i++){
			JOptionPane.showMessageDialog( null, "Click OK to roll the dice for the "+i +" time.");
			DiceGame dGame = new DiceGame();
			int die1 = dGame._roll();
			dGame = new DiceGame();
			int die2 = dGame._roll();
			int total = (die1 + die2);
			if ( guess == total ){
				JOptionPane.showMessageDialog( null, "That's correct! The dice total is " + total + "." );
				break;
			}else{
				if(i==3){
					JOptionPane.showMessageDialog( null, "Sorry, computer wins!! The dice total was "+total+".");
				}else{
					JOptionPane.showMessageDialog( null, "Sorry, that's not correct.");
				}
			}
		}
		JOptionPane.showMessageDialog( null, "Thank you for playing! Good Bye!" );
	}
}
