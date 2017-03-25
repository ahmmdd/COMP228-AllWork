package exersice2;
import java.util.Random;
/**
 * 3 roll dice game
 * @author Mohammed Ahmed
 * @author 300833356
 *
 */
public class DiceGame{
	int die = 0;
	Random random = new Random();
	int randomNumber = 0;
	//Constructor generates a random number and signs it to the dice object.
	public DiceGame(){
		randomNumber = random.nextInt(6)+1; //To exclude 0
		die = randomNumber;
	}
	//Method that returns value of the die object
	public int _roll() {
		return die;
	}
}