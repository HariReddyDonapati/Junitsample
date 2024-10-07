package com.hari;

//class AA implements Runnable
//{
//	public void run() {
//		
//	
//	for(int i=0;i<=100;i++)
//		System.out.println("Hi Hari");
//	
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
//
//class BB implements Runnable
//{
//	public void run() {
//		
//		for(int j=0;j<=100;j++)
//		{
//			System.out.println("Hello Hari");
//			try {
//				Thread.sleep(30);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//}
//}
public class ThreadLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = () ->
		{
		
		for(int i=0;i<=100;i++)
			System.out.println("Hello Hari");
		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		};
		Runnable r2 = () ->
				{
				
				for(int i=0;i<=100;i++)
					System.out.println("Hi Hari");
				
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				};
		
//		b.setPriority(Thread.MIN_PRIORITY);
//		System.out.println(b.getPriority());
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		try {
			Thread.sleep(0);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		

	}

}
