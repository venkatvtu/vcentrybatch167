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
String d="vcentrY";
System.out.println(a.compareTo(d));// 32
System.out.println(d.compareTo(a)); //-32
String e="avcentry";
System.out.println(a.compareTo(e)); // 21
System.out.println(e.compareTo(a));// -21
	String f="vcentrya";
	System.out.println(a.compareTo(f)); // -1
	System.out.println(f.compareTo(a)); // 1
	}

}
