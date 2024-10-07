package com.hari;
import java.util.*;
import java.io.*;
public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Hari, Please eneter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
		System.out.println("Hello Hari, Please eneter one more number");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  num = Integer.parseInt(br.readLine());
		
		System.out.println(num);
		br.close();
		
		
		
	}


}
