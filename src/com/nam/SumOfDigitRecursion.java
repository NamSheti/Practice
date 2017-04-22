package com.nam;

public class SumOfDigitRecursion {
	static int sum=0;
	public static void main(String[] args) {
		sumOfDigit(123);
	}

	private static void sumOfDigit(int num) {

		if(num==0)
		{
			
		}
		else
		{
			sum = sum + num%10;
			sumOfDigit(num/10);
			System.out.println("the sum is=="+sum);
		}
		System.out.println(sum);
	}
	
}
