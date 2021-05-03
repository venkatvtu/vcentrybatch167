package staticTest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest a = new StaticTest();
		System.out.println(a);
		StaticTest b = new StaticTest();
		System.out.println(b);
//calc(); // use object
		a.calc();
	
	}

	public void add() {
		System.out.println("add");
		
	}

	public static void sub() {
		System.out.println("sub");
		
	}

	public void calc() {
		add();
		sub();
	}
}
