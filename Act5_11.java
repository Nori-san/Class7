package Act5;

import java.util.Scanner;

public class Act5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false. 
//		Expected Output:
//		Input an integer: 8642
//		Check whether every digit of the said integer is even or not!
//		true

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num = input.nextInt();
		
		System.out.println("Check weather every digit of the said integer is even or not!");
		System.out.println(ifDigitsAreEven(num));
		input.close();

	}
	
	public static boolean ifDigitsAreEven(int num) {
		int digit;
		while ( num != 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				return true;
			}
			num /= 10;
		}
		return false;
	}

}
