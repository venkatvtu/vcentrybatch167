package additional;

public class A2_JavaDocTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		add(1, 1);
		
	}
	/**
	 * 
	 * @param i
	 * @param j
	 * @throws InterruptedException
	 */
	public static void add(int i,int j) throws InterruptedException
	{
		/**
		 * Adding two number
		 */
		System.out.println(i+j);
		Thread.sleep(2000);
	
	}
	
	
}
