package exceptionHandling;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program initialize");
		try {
		int i=1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("alert: please enter valid input");
		System.out.println(e.getLocalizedMessage());
		}
		System.out.println("program completed");
		
		
		
	}

}
