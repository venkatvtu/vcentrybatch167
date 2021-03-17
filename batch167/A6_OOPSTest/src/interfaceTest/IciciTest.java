package interfaceTest;

public class IciciTest implements RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RBITest r= new RBITest(); can not create object for interface
		// c,d,l,net    = c,d,l,net 
		IciciTest i = new IciciTest();// object created only for class
		i.credit();
		i.debit();
		i.loan();
		i.netbanking();
		// c,d,l       =  c,d,l,net
		RBITest ri = new IciciTest();// object created for class and map to interface
	ri.credit();
	ri.debit();
	ri.loan();
	//ri.netbanking(); not visible 
	System.out.println(RBITest.month);
	//RBITest.month = RBITest.month+12; interface variable by default final
	System.out.println(RBITest.month);
	}
	public void netbanking()
	{
		
	}

	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit logic from icici");
	}

	
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan logic from icici 18%");
	}



	
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit logic from icici");
	}

}
