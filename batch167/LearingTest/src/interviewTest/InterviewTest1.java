package interviewTest;

public class InterviewTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		mymethod(null);
	}

	public static void mymethod(String s)
	{
		System.out.println("from string method");
	}
	public static void mymethod(Object o)
	{
		System.out.println("from object method");
	}
	
}
