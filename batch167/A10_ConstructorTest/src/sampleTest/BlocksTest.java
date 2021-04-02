package sampleTest;

public class BlocksTest {
	static {
		System.out.println("static block2");
	}
	{
		System.out.println("normal block");
	}
	static {
		System.out.println("static block1");
	}
	
	BlocksTest(){
		System.out.println("constructor block");
	}
	public static void add() {
		System.out.println("function block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BlocksTest b= new BlocksTest();
		
		
		
		
	}

}
