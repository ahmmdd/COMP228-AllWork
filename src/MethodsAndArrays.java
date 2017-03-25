import java.security.SecureRandom;

public class MethodsAndArrays {

	public static void main(String[] args) {
		
		System.out.println(rollDice(3, 6));
	}
	public static int rollDice(int numDice, int numSides){
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		int[] dice = new int[numDice];
		for (int index = 0; index < numDice - 1; index++){
			result += generateRandom.nextInt(numSides) + 1;
			
		}
		
		return result;
	}
}
