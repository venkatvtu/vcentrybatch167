package abstractTest;

public abstract class RBITest {
	public abstract void credit();

	public abstract void debit();

	public static void loan() {
		System.out.println("loan from rbi test abstract class");
	}

	public static void kyc() {
		System.out.println("kyc from rbi test abstract class");
	}
}
