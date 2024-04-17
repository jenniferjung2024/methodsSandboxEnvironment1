# methodsSandboxEnvironmentExample
Create sandbox environment for methods....Homework set #10 for CSE 118 (Fundamentals of Programming) 

CSE118

Homework Set 10

1.	Define a method to generate a random integer number in range [lowerBound, upperBound], return this random number. Method header is shown in below:

		int genereteRandomNumber (int lowerBound, int upperBound);

2.	Define a method to randomly generate a character in range [ch1, ch2], return this character. Method header is shown in below:
	
		char genereteCharacter (char ch1, char ch2);

3.	Define a method to check if a string is a valid hexadecimal number. A string hexadecimal number is a string with leading tag “0x” followed by one or more digital characters or hexadecimal letters: {‘a’, ‘b’, ‘c’, ‘d’, ‘e’, ‘f’} (uppercase or lowercase). For example, the following strings are valid hexadecimal numbers: “0x0124abcd”, “0x1A2B3C8000”. The method returns true if the string is a hexadecimal number, or false otherwise.
   
4.	Write a method to convert a number of seconds to the format of HH:MM:SS. Test this method in main():
	
	 	String convertSecondsToHHMMSS(int seconds);
  	
5.	Write a method to compute the following summation:
   
		sum(i) = 1/2 + 2/3 + 3/4 + … + i/(i+1)

6.	Define a method to list all numbers which are divisible by 3 and 7 but not both in a certain range. Pass to this method a parameter to indicate how many numbers will be displayed per line. Return how many such numbers are found in the range.
   
		int listNumbers(int low, int upp, int numPerLine);

7.	Write Java program to list digital characters or letters and their ASCII code:
   
		(a)	Define a method to get ASCII code of a character: 
			Given a digital character or letter, find its ASCII code. Return this code as a string to represent decimal number or hexadecimal value.
  	
				String getASCIICode(char ch, boolean isDecimal);
  	
			If parameter “isDecimal” is true, return decimal number as a string; if it’s false, return hexadecimal value.
			For example, if input char is ‘0’ and “isDecimal” is true, the string returned will be “48”, if the “isDecimal” is false, the return will be “0x30”
  	
		(b)	Display a table showing all digital characters and their ASCII numbers in decimal and hexadecimal notations. Call method defined in (a) to get ASCII code 			for each character in the table.
	
				The output should be like:
  				
				char 	dec 	hexadec 
				==========================
  	
				0 	48 	0x30 
				1 	49	0x31 
				2 	50 	0x32 
				3 	51 	0x33 
				4 	52 	0x34 
				5 	53 	0x35 
				6 	54	0x36 
				7 	55 	0x37 
				8 	56 	0x38 
				9 	57 	0x39
  	
		(c)	Display a table showing all letters and their ASCII code in decimal and hexadecimal notations. The output is like the output in (b).


-----

![image](https://github.com/jenniferjung2024/methodsSandboxEnvironmentExample/assets/164530692/cc149e85-8eb0-4d08-90c1-ba07efc8ac19)

-----

To follow along with Professor's feedback, I will create a new version with one Java project, multiple methods as each question, and a main() method as a sandbox environment to test out the various methods/questions.


