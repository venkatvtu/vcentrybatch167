package interviewQuestions;

public class FindElementPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5,6,7,8};
		
		int numberToFind=2;
		
		boolean found= false;
		for (int number : array) {
		
			if(number==numberToFind)
			{
				found=true;
				System.out.println("number is present");
				break;
				
			}
			
			
		else
			System.out.println("number is not present");
			
		}
		
		}
		
		
	}


