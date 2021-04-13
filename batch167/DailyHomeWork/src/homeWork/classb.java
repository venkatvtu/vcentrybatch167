package homeWork;

public class classb extends classa {
	public static void add()
	{
		System.out.println("add the child number");
	}
	public static void mul()
	{
		System.out.println("mul two numbers");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classa num = new classb();
		num.add();
		num.sub();
		// num.mul();

		/*classb cls = new classb();
		cls.mul();
		cls.add();
		cls.sub();*/
	}

}
