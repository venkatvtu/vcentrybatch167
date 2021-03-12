package staticTest;

public class CountTest {

	public static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountTest c1 = new CountTest();
		CountTest c2 = new CountTest();
		CountTest c3 = new CountTest();
	c1.count();
	c2.count();
	c3.count();
	}
	public void count()
	{
		i++;
		System.out.println(i);
	}

}
