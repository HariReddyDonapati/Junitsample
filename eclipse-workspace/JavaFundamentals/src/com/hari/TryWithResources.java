package com.hari;
import java.io.*;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int i =0;
		int j=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
//			j= 18/i;
//			
//			System.out.println("output is " +j);
			
			int num = Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		catch (Exception e)
		{
			System.out.println("something went worng "+e);
		}
		finally {
			
			br.close();
			
		}
	}

}
