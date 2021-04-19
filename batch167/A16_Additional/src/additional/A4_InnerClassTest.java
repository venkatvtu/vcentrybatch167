package additional;

public class A4_InnerClassTest {

	class myInnerClassTest{
		
		void msg() {
		System.out.println("Welcome vcentry");	
		}
	}
	
	void add() {
		
	}
	public static void main(String[] args) {
		A4_InnerClassTest a=new A4_InnerClassTest();//object
		a.add();
		
		//inner class object
		
		A4_InnerClassTest.myInnerClassTest mic=a.new myInnerClassTest();
		mic.msg();
	}
}
