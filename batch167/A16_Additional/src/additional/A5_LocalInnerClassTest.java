package additional;

public class A5_LocalInnerClassTest {
	void msg()
	{
		class localclass
		{
		void add()
		{
			System.out.println("add");
		}
		}
		localclass l = new localclass();
		l.add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A5_LocalInnerClassTest a = new A5_LocalInnerClassTest();
		a.msg();
		
		
	}

}
