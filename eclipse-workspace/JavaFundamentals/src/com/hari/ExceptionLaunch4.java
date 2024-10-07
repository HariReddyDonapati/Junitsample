package com.hari;


class HariException extends Exception
{
	public HariException(String str)
	{
		super(str);
	}
}
public class ExceptionLaunch4 {

	public static void main(String args[])
	{
	
	int i =20;
	int j =0;

	
	try {
		 j =18/i;
		 if (j==0)
			{
				throw new HariException("i don't want to print zero");
			}
		 
	}
	catch(HariException e)
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
