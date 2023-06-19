package Act5;

import java.util.Scanner;

public class Act5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java method for extracting the first digit from a positive or negative integer. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer (positive/negative): ");
		int num = input.nextInt();
		
		System.out.println("Extract the first digit from the said integer:\n" + firstDigit(num));
		input.close();
	}
	
	public static int firstDigit(int num) {
		 num = Math.abs(num);
		
		while (num >= 10) {
			 num /= 10;
		}
		return num;
	}

}
