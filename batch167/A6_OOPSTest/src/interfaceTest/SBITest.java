package interfaceTest;

public class SBITest implements RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBITest s = new SBITest();
		s.credit();
		s.debit();
		s.loan();
		s.mobilebanking();
		RBITest r= new SBITest();
		r.credit();
		r.debit();
		r.loan();
		//r.mobilebanking();  not visible
	}
	public void mobilebanking()
	{
		
	}

	
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit logic from sbi");
	}

	
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit logic from sbi");
	}

	
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan logic from sbi 10%");
		
	}

}
