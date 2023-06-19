package Act5;

import java.util.Scanner;

public class Act5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = input.nextInt();
		
		matrixDisp(num);
		input.close();

	}
	
	//display the table of matrix
	public static void matrixDisp(int num) {
		int[][] matrix = new int[num][num];
		
		for (int i = 0; i < num; i++) {  //i is the row of the table
			for (int j = 0; j < num; j++) { //j is the column of the table
				if ((i + j) % 3 == 0) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(matrix[i][j] + " ");
			} System.out.println();
		}
	}
}
