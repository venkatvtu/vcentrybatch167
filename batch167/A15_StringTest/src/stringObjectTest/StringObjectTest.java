package stringObjectTest;

public class StringObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="vcentry";
		String b= "vcentry";
		String c = new String("vcentry");
		String d = new String("vcentry");
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		System.out.println("---------------");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		
	}

}
