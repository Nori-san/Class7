package Act5;

import java.util.Scanner;

public class Act5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		7. Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false. 
//		Expected Output:
//		Input the first number:  15
//		Input the second number:  16
//		Input the third number:  17
//		Check whether the three said numbers are consecutive or not!true

		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int num1 = input.nextInt();
		System.out.print("Input the second number: ");
		int num2 = input.nextInt();
		System.out.print("Input the third number: ");
		int num3 = input.nextInt();
		
		System.out.print("Check weather the three said numbers are consecutive or not! " + areConsecutive(num1,num2,num3));
		
		input.close();

	}
	
	public static boolean areConsecutive(int num1, int num2, int num3) {
		int min = Math.min(Math.min(num1, num2), num3);
		int max = Math.max(Math.max(num1, num2), num3);
		for (int i=min; i <= max; i++) {
			if (i != num1 && i != num2 && i != num3) {
				return false;
			}
		}
		return true;
	}

}
