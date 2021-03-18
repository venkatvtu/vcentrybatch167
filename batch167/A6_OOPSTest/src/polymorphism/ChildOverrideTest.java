package polymorphism;

public class ChildOverrideTest extends ParentOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//super.add();
		ChildOverrideTest c =  new ChildOverrideTest();
		c.copy();
	}
	public static void add()
	{
		System.out.println("i am from child add");
	}
	public static void add(int i,int j)
	{
		System.out.println(i+j+"from child");
	}
	public void copy()
	{
		super.add();// from parent 
		add();// from child
		this.add();// from child
		add(1, 1);
		super.add(2, 2);
	}
}
