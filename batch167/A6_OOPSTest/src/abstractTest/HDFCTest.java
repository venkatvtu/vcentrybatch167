package abstractTest;

public class HDFCTest extends RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kyc();
		loan();

		HDFCTest h = new HDFCTest();
		h.credit();
		h.debit();
		h.netbanking();
		

		RBITest r = new HDFCTest();
		r.credit();
		r.debit();
//r.netbanking(); not visible
	}

	public void netbanking() {

	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	

}
