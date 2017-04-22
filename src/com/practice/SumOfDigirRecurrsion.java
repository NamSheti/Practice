package com.practice;

public class SumOfDigirRecurrsion {
	public static void main(String[] args) {
		int num =1231;
		int sum = sumofdigir(num);
		System.out.println(sum);
	}

	private static int sumofdigir(int num) {
		if(num ==1)
		{
			return num;
		}
		else
		//while(num >0)
		{
			int sum=0;
			sum = sum + (num %10)+sumofdigir(num/10);
			//sumofdigir(num/10);
		
		//System.out.println(sum);
		return sum;
		}
		//int sum;
		
	}

}
