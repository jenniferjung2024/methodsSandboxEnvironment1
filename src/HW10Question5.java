import java.util.Scanner;

public class HW10Question5 {

	public static double calcSum(int userInput) {
		double sum = 0;
				
		for (int i = 1; i <= userInput; ++i) {
			sum += (i / (double)(i+1));
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {

		System.out.print("Enter an integer number: ");
		Scanner scnr = new Scanner(System.in);
		int userNumber = scnr.nextInt();
		
		System.out.println(calcSum(userNumber));
		scnr.close();

	}

}
