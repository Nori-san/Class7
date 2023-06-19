package Act5;

import java.util.Scanner;

public class Act5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		8. Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false. 
//		Expected Output:
//		Input the first number:  2
//		Input the second number:  4
//		Input the third number:  6
//		Check whether the three said numbers has a midpoint!
//		true

		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int num1 = input.nextInt();
		System.out.print("Input the second number: ");
		int num2 = input.nextInt();
		System.out.print("Input the third number: ");
		int num3 = input.nextInt();
		
		System.out.println("Check weather the three said numbers has a midpoint! \n" + isMiddlePoint(num1,num2,num3));
		
		input.close();

	}
	
	public static boolean isMiddlePoint(int num1, int num2, int num3) {
		int min = Math.min(Math.min(num1, num2), num3);
		int max = Math.max(Math.max(num1, num2), num3);
		int mid = num1 + num2 + num3 -max - min;
		if (mid ==num1 || mid == num2 || mid == num3) {
			return true;
		} else {
			return false;
		}
			
		
		
	}

}