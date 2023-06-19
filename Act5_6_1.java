package Act5;

import java.util.Scanner;

public class Act5_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6. Write a Java method to find if given number from user is prime or not. 
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        if (isPrimeNumber(num) == true) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
	}
	
	public static boolean isPrimeNumber(int num) {
		int sqrt = (int) Math.sqrt(num);
		if (num <=1 ) {
			return false;
		} 
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
