package com.nam;

//logic of amstrong is sum of the cubes of the number is qual to original number.
public class AmstrongNumber {
	public static void main(String[] args) {
		int num =371;
		int sum=0;
		int r=0;
		int tmp=num;
		while(tmp >0)
		{
			
			
			r = tmp % 10;
			sum = sum + r * r * r;
			tmp = tmp / 10;
		}
		System.out.println("the sum is=="+sum);
		System.out.println("the num is=="+num);
		if(sum==num)
		{
			System.out.println("the sum is=="+sum);
			System.out.println("the given number is amstrong");
		}
		else
		{
			System.out.println("the sum is=="+sum);
			System.out.println("the given number is not amstrong");
		}
	}

}
