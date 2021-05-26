package interviewQuestions;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =29;
		boolean f = false;
		//boolean f= false;
		for(int i=2;i<sum/2;i++)
		{
			if(sum% i==0)
			{
				f= true;
				break;
			}
		}
		if(!f)
		{
			System.out.println(sum + "is a prime number");
		}else
		{
			System.out.println(sum + "is not a prime number");
		}
		
		
		
		
	}

}
