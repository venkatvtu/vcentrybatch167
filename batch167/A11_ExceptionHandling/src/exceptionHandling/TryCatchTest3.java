package exceptionHandling;

public class TryCatchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int [] a=new int[2];
			a[0]=10;
			a[1]=20;
			//a[2]=30;
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println("alert: sorry something went wrong");
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		
	}

}
