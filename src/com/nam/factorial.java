package com.nam;

public class factorial {
	public static void main(String[] args) {
		int num=5;
		int fact = factorial(num);
		System.out.println(fact);
	}

	private static int factorial(int num) {
		int fact = num;
		if(num==0)
		{
			return 1;
		}
		else
		{
			fact = fact * factorial(num - 1);
		}
		return fact;
		
		
	}

/*	private static void factorial(int num) {
		int fact = num;
		for(int i=1;i<num;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
	}*/

}
