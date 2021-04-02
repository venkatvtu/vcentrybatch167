package sampleTest;

public class ConstructorTest {
	
	public static int i;
	public static int j;
	
	public ConstructorTest(){
		i=5;
		j=5;
	}
	public ConstructorTest(int i,int j){
		this.i=i;
		this.j=j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int j = 0;
		System.out.println(i);
		System.out.println(j);
		
		ConstructorTest c= new ConstructorTest();
		
		System.out.println(i);
		System.out.println(j);
		
		ConstructorTest d= new ConstructorTest(10,10); // paramitarized constructor
		System.out.println(i);
		System.out.println(j);
	}

}
