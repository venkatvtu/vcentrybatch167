package exceptionHandling;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("try finally initialize");
		
		try 
		{
			System.out.println("log in db");
		int i=1/0;
		}
		catch(Exception e)
		{
			System.out.println("alert : invalid number");
			System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			System.out.println("log out db");
		}
		System.out.println("try finally completed");
		
		
		
		
	}

}
