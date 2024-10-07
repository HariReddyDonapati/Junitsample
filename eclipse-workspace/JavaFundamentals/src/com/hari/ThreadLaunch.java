package com.hari;


class A extends Thread
{
	public void run() {
		
	
	for(int i=0;i<=100;i++)
		System.out.println("Hi Hari");
	
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class B extends Thread
{
	public void run() {
		
		for(int j=0;j<=100;j++)
		{
			System.out.println("Hello Hari");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
public class ThreadLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		B b= new B();
		
//		b.setPriority(Thread.MIN_PRIORITY);
//		System.out.println(b.getPriority());
		
		a.start();
		try {
			Thread.sleep(0);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		

	}

}

