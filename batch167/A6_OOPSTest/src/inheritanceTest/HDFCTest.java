package inheritanceTest;

public class HDFCTest extends RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*RBITest R = new RBITest();
		R.credit();
		R.debit();
		R.loan();
		R.eduloan();*/
		
		credit();
		debit();
		eduloan();
		personalloan();
		loan();
	System.out.println("interest rate: "+interest);
	}
public static void personalloan()
{
	System.out.println("personal loan logic from hdfc");
}
}
