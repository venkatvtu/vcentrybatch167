package interviewQuestions;

import java.util.Arrays;

public class PrintSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print smallest number in 3*3 matrix
		// 2 4 5
		// 3 4 7
		// 1 2 9

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = abc[0][0];// 2
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);

		PrintSmallestNumber ps = new PrintSmallestNumber();
		ps.findSmallest();
		ps.usingArray();
	}

// single dimension array

	int givenarray[] = { 2, 4, 1, 3, 5 };

	public void findSmallest() {
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < givenarray.length; i++) {
			if (givenarray[i] < smallest) {
				smallest = givenarray[i];
			}
		}
		System.out.println(smallest);

	}
	// using arrays
	public void usingArray()
	{
		Arrays.sort(givenarray);
		System.out.println(givenarray[0]);
	}
	
	
}
