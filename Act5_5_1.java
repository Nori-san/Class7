package Act5;

import java.util.Scanner;

public class Act5_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5. Write a Java method to create a pentagon's area. 
//		Expected Output:
//		Input the number of sides: 5                             
//		Input the side: 6                                        
//		The area of the pentagon is 61.93718642120281
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of sides: ");
		int sideNum = input.nextInt();
		
		while (sideNum > 5 || sideNum < 5) {
			System.out.print("Re-Input the number of sides (only Pentagon):");
			 sideNum = input.nextInt();
		}
		
		System.out.print("Input the side: ");
		int sideLength = input.nextInt();
		
		
		
		//Calling the method areaOfPentagon
		System.out.println("The area of the pentagon is " + areaOfPentagon(sideLength));
		input.close();

	}
	
	public static double areaOfPentagon(double sideLength) {
		//apothem = 0.5 × a / tan(π/5)
		double apothem = 0.5 * sideLength / Math.tan(Math.PI/5);
		//area of a Pentagon area= (5*s*a) /2
		double area = (5 * sideLength * apothem) / 2;
		return area;
	}

}
