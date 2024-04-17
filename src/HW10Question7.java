
public class HW10Question7 {
	
	public static String getASCIICode(char ch, boolean isDecimal) {
		
		String ascii = "";
		int asciiInt =(int)ch;
		
		if (isDecimal) {
			ascii = String.valueOf(asciiInt); 	
		}
		
		if (!isDecimal) {
					
			String hexValue = "";
			
			int num =  asciiInt;
			
			int firstValue = num / 16;
			int rem = num % 16;
			hexValue += firstValue;
			
			if (rem < 10) {
				hexValue = hexValue + rem;
			}
			else {
				// map out A-F
				
				char charValue = (char) ('A' + (rem - 10));
				
				hexValue = hexValue + charValue;			
			}			

			
			
			ascii = "0x" + hexValue;
			
			
		}
		
		return ascii;
	}

	
	public static void main(String[] args) {

		System.out.println("Part B:\n");
		
		System.out.printf("%-10s %-10s %10s\n", "char", "dec", "hexadec");
		
		for (int i = 0; i <= 9; ++i) {
			String createString = String.valueOf(i);
			char createChar = createString.charAt(0); 
					
			System.out.printf("%-10d %-10s %10s\n", i, getASCIICode(createChar, true), getASCIICode(createChar, false));
		}
		
		
		System.out.println("\n\n\nPart C:\n");
		
		System.out.printf("%-10s %-10s %10s\n", "char", "dec", "hexadec");
		
		for (int i = 0; i < 26; ++i) {
			char lowerLetter = 'a';
			lowerLetter += i;
			
			System.out.printf("%-10s %-10s %10s\n", lowerLetter, getASCIICode(lowerLetter, true), getASCIICode(lowerLetter, false));
		}
		
		for (int i = 0; i < 26; ++i) {
			char uppercaseLetter = 'A';
			uppercaseLetter += i;
			
			System.out.printf("%-10s %-10s %10s\n", uppercaseLetter, getASCIICode(uppercaseLetter, true), getASCIICode(uppercaseLetter, false));
		}

	}

}
