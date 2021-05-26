package interviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int givenNumber=123; int reversedNumber=0; while(givenNumber!=0) {
		 * reversedNumber=reversedNumber*10;
		 * reversedNumber=reversedNumber+givenNumber%10; givenNumber=givenNumber/10; }
		 * System.out.println(reversedNumber);
		 */
		// OR by using the scanner
		int givenNumber = 0;
		int reversedNumber = 0;
		System.out.println("Enter your number:");
		Scanner scanner = new Scanner(System.in);
		givenNumber=scanner.nextInt();
		
		while (givenNumber != 0) {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + givenNumber % 10;
			givenNumber = givenNumber / 10;
		}
		System.out.println(reversedNumber);
	}

}
