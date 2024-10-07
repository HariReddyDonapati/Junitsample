package com.hari;


class Counter
{
	int count = 0;
	public void increment()
	{
		count++;
	}
}
public class ThreadLauch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c = new Counter();
		Runnable r1 = () ->
		{
		
		for(int i=0;i<=10;i++) {
			c.increment();
			System.out.println("Heri"+ c);
		}
		
		
		};
		Runnable r2 = () ->
				{
				
				for(int i=0;i<=10;i++)
				{
					c.increment();
					System.out.println("Kishore"+ c);
				}
				
				
				};
			
		
				Thread t1 = new Thread(r1);
				Thread t2 = new Thread(r2);
				t1.start();
				t2.start();
				System.out.println(c.count);
	}

}
