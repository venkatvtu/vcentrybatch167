package loopingTest;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Test 2
		/*
		 * int i=5; 
		 * while(i>0) 
		 * { System.out.println(i); 
		 * i--; }
		 */
	
		// for test 3
		/*
		 * int i=0; 
		 * while(i<5) 
		 * { System.out.println("*"); 
		 * i++; }
		 */
	
		//for test 4
		/*char i='a';
		while(i<='z')
		{
			System.out.println(i);
			i++;
		*/
		// for test 5
		
		
		/*
		 * int i=0; while(i<=100) { System.out.println("vcentry"+i); i++; }
		 */
		 
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<i;j++) { for(int k=0;k<j;k++) {
		 * System.out.print(" "); } System.out.println("* "); } }
		 */
	for (int i=0;i<5;i++)
	{
		for (int k=0;k<5-i;k++)
		{
			System.out.print(" ");
		}
		for (int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}
	}
	
}


