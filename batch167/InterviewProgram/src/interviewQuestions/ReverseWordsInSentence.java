package interviewQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="venkat learning java";
		String reversed="";
		
	String[] temp=	given.split(" ");
		for(int i=temp.length-1;i>=0;i--)
		{
			reversed=reversed+temp[i]+" ";
		}
		System.out.println(reversed);
		
		
		
		
	}

}
