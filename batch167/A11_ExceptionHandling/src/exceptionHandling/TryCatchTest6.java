package exceptionHandling;

public class TryCatchTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program initialize");
		try {
			
			String name=null;
			name.toUpperCase();
			
			int [] a=new int[2];
			a[0]=10;
			a[1]=20;
			a[2]=30;
		int i=1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("alert: please enter valid input");
		System.out.println(e.getLocalizedMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("alert: please limit the items");
			System.out.println(e.getLocalizedMessage());
		}
		catch(Exception e) {
			System.out.println("alert: sorry something went wrong");
			System.out.println(e.getLocalizedMessage());
		}
		catch(Throwable t) {
			System.out.println("alert: internal server error");
			System.out.println(t.getLocalizedMessage());
		}
		System.out.println("program completed");
		
		
		
	}

}
