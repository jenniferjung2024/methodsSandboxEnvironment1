
public class HW10Question6 {

	public static int listNumbers(int low, int upp, int numPerLine) {
		
		int count = 0;
		int number = low;
		
		for (int i = number; i <= upp; ++i) { 
			if (i % 3 == 0 ^ i % 7 == 0) {
				count++;
			}
		}
		
		int numLines = count / numPerLine; // instructions say to "Pass to this method a parameter to indicate how many numbers will be displayed per line" even though this information is not used in the return statement (# of lines) 
		
		return count;  // instructions say to "return how many numbers are found in the range"
	}
	
	
	public static void main(String[] args) {

		System.out.println(listNumbers(0, 100, 2));
		
	}

}
