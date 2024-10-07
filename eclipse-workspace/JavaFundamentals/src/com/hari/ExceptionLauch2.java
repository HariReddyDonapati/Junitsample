package com.hari;

public class ExceptionLauch2 {

	public static void main(String args[])
	{
	
	int i =3;
	int j =0;
	String str =null;
	
	int arr[] = new int[5];
	
	try {
		 j =18/2;
		 System.out.println(str.length());
		System.out.println(arr[1]);
		System.out.println(arr[5]);
		 
	}
	catch(ArithmeticException e)
	{
		System.out.println("Value cannot divide by Zero "+ e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index value going beyond the limit "+ e);
	}
	catch(Exception e)
	{
		System.out.println("Something went worng  " +e);
	}
	
	
//	System.out.println(j);
	System.out.println("Bye");
	
	}


}
