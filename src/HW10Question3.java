import java.util.Scanner;

public class HW10Question3 {
	
	public static boolean checkHex(String inputString) {
		
		boolean validHex = false;
		
		if (inputString.charAt(0) == '0' && inputString.charAt(1) == 'x') {
			if (Character.isDigit(inputString.charAt(2)) || Character.isLetter(inputString.charAt(2))) {   
				validHex = true;
			}
			// used an if statement here because instructions said it must be followed by one or more, not all (I would have used a loop check)
			// for the loop statement, I would set validHex to true and loop until I find a false case, which then I would break out of the loop check after setting the variable to false
		}
				
		return validHex;	
	}

	
	public static void main(String[] args) {
		
		System.out.print("Enter a String: ");
		Scanner scnr = new Scanner(System.in);
		String userInput = scnr.nextLine();
		
		System.out.print("Is " + userInput + " a valid hexadecimal number?");
		if (checkHex(userInput) == true)  // save memory by not storing this value, as it's not needed for this program
			System.out.println(" Yes");
		else 
			System.out.println(" No");
		
		scnr.close();
		
	}

}
