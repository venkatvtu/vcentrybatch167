package returnTypeTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add();
//sub();
		int result = add()+sub();
		System.out.println("result is"+result);
		System.out.println(msg());
		String r = msg();
		System.out.println(r);
	}

	public static int add() {
		System.out.println("add");
	int i=1;
	int j=1;
	int k =i+j;
	//int a=k+i;
	System.out.println(k);
	return k;
	//System.out.println(); return statement must be last 
	//return a; // more than one return not allowed
	}

	public static int sub() {
		System.out.println("sub");
	int i =5;
	int j=2;
	int k =i-j;
	System.out.println(k);
	return k;
	}
	public static String msg()
	{
		System.out.println("msg");
		int i=1;
		int j=1;
		int k=i+j;
		String m = "addition of two number is:";
		String result = m+k;
		return result;
	}
}
