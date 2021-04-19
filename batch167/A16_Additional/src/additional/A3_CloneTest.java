package additional;

public class A3_CloneTest implements Cloneable {
	
   public static int i=0;
   public A3_CloneTest(int i) {
	   this.i=i;
   }
	public static void main(String[] args) throws CloneNotSupportedException {
	
		A3_CloneTest a=new A3_CloneTest(10);
		System.out.println(a.i);
		
		A3_CloneTest b=new A3_CloneTest(20);
		System.out.println(b.i);
		
		A3_CloneTest c=(A3_CloneTest) a.clone();
		System.out.println(c.i);
	}
	
	
}
