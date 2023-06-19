package Act5;

import java.util.Scanner;

public class Act5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. Write a Java method to check whether a year (integer) entered by the user is a leap year or not. 
//		Expected Output:
//		Input a year: 2017                                                                        
//		false

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a year: ");
		int year = input.nextInt();
		
		leapYear(year);
		
		input.close();
	}
	
	public static void leapYear(int year) {
		boolean isleapYear;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			 isleapYear =  true;
		} else {
			 isleapYear = false;
		}
		System.out.println(isleapYear);
	}

}
