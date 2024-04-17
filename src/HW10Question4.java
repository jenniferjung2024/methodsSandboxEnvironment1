
public class HW10Question4 {
	
	public static String convertSecondsToHHMMSS(int seconds) {
		
		int hr = seconds / 3600;
		int min = seconds / 60 % 60;
		int sec = seconds % 60;
		
		String solution = "" + hr + ":" + min + ":" + sec;
				
		return solution;
	}

	public static void main(String[] args) {

		System.out.println(convertSecondsToHHMMSS(8000));  // instructions just say to test this method, not to generate program to get user input or to store it into a variable

	}

}
