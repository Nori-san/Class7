package Act5;

import java.util.Scanner;

public class Act5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false. 
//		
//		Expected Output:
//		Input a string:  AIEEE
//		Check all the characters of the said string are vowels or not!
//		true


		Scanner input = new Scanner(System.in);
		System.out.print("Input an string: ");
		String letter = input.next();
		
		System.out.println("Check all the characters of the said string are vowels or not!");
		System.out.println(areVowels(letter));
		input.close();

	}
	
	public static boolean areVowels(String letter) {
		for (int i = 0; i < letter.length(); i++) {
		char singleChar = Character.toLowerCase(letter.charAt(i));
		if (singleChar == 'a' || singleChar == 'e' || singleChar == 'i' || singleChar == 'o' || singleChar == 'u') {
			return true;
			} 
		}
		return false;
		
	}

}
