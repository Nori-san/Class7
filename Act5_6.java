package Act5;

import java.util.Scanner;

public class Act5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write Java methods to calculate triangle area. 
//		Expected Output:
//		Input Side-1: 10                                                                               
//		Input Side-2: 15                                                                               
//		Input Side-3: 20                                                                              
//		The area of the triangle is 72.6184377413890

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Side-1: ");
		int side1 = input.nextInt();
		System.out.print("Input Side-2: ");
		int side2 = input.nextInt();
		System.out.print("Input Side-3: ");
		int side3 = input.nextInt();
		
		//Calling the method areaOfTriangle
		System.out.println("The area of the triangle is " + areaOfTriangle(side1, side2, side3));
		input.close();

	}
	
	//to calculate the area of a triangle method using Herons formula Area = √[s(s-a)(s-b)(s-c)]
	public static double areaOfTriangle(double side1, double side2, double side3) {
		double semiPerimeter = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3) );
		return area;
	}

}
