import java.util.Random;

public class HW10Question1 {
	
	public static int generateRandomNumber(int lowerBound, int upperBound) {
		Random random = new Random();
		int randomNumber = random.nextInt(lowerBound, upperBound + 1);
		return randomNumber;
	}

	public static void main(String[] args) {
		
		int randNum = generateRandomNumber(5, 10);
		
		System.out.println("Random number: " + randNum);
	}

}
