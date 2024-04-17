import java.util.Random;

public class HW10Question2 {
	
	public static char generateCharacter(char ch1, char ch2) {
		Random random = new Random();
		char randomCharacter = (char)random.nextInt(ch1, ch2 + 1);
		return randomCharacter;
	}

	public static void main(String[] args) {
		
		char randChar = generateCharacter('a', 'c');
		
		System.out.println("Random character: " + randChar);
	}

}
