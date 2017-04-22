package com.nam;

public class SumOfThousandPrime {
	public static void main(String[] args) {
		int count=0;
		int number=2;
		int sum = 0;
		while(count < 5)
		{
			if(isPrime(number))
			{
				System.out.println("the number is=="+number);
				sum = sum + number;
				count++;
			}
			number++;
		}
		System.out.println("the sum is=="+sum);
	}

	private static boolean isPrime(int number) {
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
