package interviewQuestions;

public class FindLengthOfTheStringWithoutLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="venkat";
		
	char[] chararray =	given.toCharArray();
	 int length=0;	
	for (char c : chararray) {
		length++;	
		}
		System.out.println(length);
		
	}

}
