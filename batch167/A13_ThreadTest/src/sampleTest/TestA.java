package sampleTest;

public class TestA extends Thread{
public void run()
{
	add();
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestA a1 = new TestA();
		TestA a2 = new TestA();
		TestA a3 = new TestA();
		//a1.run();
		//a2.run();
		//a3.run();
		a1.setName("vcentry thread1");
		a2.setName("vcentry thread2");
		a3.setName("vcentry thread3");
		a1.setPriority(MAX_PRIORITY);
		a2.setPriority(MIN_PRIORITY);
		a3.setPriority(NORM_PRIORITY);
		
		
		a1.start();
		//a1.sleep(10000);
		a2.start();
		a3.start();
		//a1.start();
		a1.stop();
		//a1.start();
	}
	public static void add()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getId()+"---"+Thread.currentThread().getPriority()+"---"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block+
				e.printStackTrace();
			}
		}
	}
}
