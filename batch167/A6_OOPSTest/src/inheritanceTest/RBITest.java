package inheritanceTest;

public class RBITest extends WorldBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WorldBank W = new WorldBank();
		W.credit();
		W.debit();
		W.loan();*/ // this can be achieved with the help of Extends 
	credit();
	
	debit();
	//loan();
	eduloan();
	System.out.println("interest rate: " +interest);
	}
	public static void eduloan() {
		System.out.println("Educational loan logic from rbi");
	}

}
