package Act5;

import java.util.Scanner;

public class Act5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10. Write a Java method to display the factors of 3 in a given integer. 
//		Expected Output:
//		Input an integer(positive/negative): 81
//
//		Factors of 3 of the said integer:
//		81 = 3 * 3 * 3 * 3 * 1

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer (positive/negative): ");
		int num = input.nextInt();
		
		System.out.println("Factors of 3 of the said integer: ");
		factorOfThree(num);
		input.close();
	}
	
	public static void factorOfThree(int num) {
		 num = Math.abs(num);
		 System.out.print(num + " = ");
		 for (int i = 0; i <= num; i++) {
			 if (num % 3 == 0) {
			 System.out.print("3 * ");
			 num/= 3;
			 } else {
				 break;
			 }
		 }
		 System.out.print("1");
	} 

}
