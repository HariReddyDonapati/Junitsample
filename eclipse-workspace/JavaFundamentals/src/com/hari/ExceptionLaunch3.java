package com.hari;

public class ExceptionLaunch3 {

	public static void main(String args[])
	{
	
	int i =20;
	int j =0;

	
	try {
		 j =18/i;
		 if (j==0)
			{
				throw new ArithmeticException("i don't want to print zero");
			}
		 
	}
	catch(ArithmeticException e)
	{
		j=18/1;
		
		System.out.println("This is the default output "+ e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index value going beyond the limit "+ e);
	}
	catch(Exception e)
	{
		System.out.println("Something went worng  " +e);
	}
	
	
	System.out.println(j);
	System.out.println("Bye");
	
	}

}
