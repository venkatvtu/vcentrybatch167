package interfaceTest;

public interface RBIStaticTest {
	public void credit();
	public void debit();
	public void loan();
	public static void kyc()
	{
		System.out.println("kyc should collected before march 31");
	}
}
