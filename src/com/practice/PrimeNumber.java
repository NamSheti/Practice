package com.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=6;
		primeCheck(num);
	}

	private static void primeCheck(int num) {
		int res=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				res = 0;
				break;
			}
			else
				res=1;
		}
		if(res==0)
		{
			System.out.println("Not");
		}
		else
		{
			System.out.println("Prime");
		}
		
	}

}
