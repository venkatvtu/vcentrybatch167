package stringTest;

public class CompareToTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="vcentry";
String b="vcentry";
System.out.println(a.compareTo(b));//0
String c="Vcentry";
System.out.println(a.compareTo(c));//32 = a compare to c
System.out.println(c.compareTo(a)); // -32 = c compare to a
	}

}
