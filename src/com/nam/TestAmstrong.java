package com.nam;

public class TestAmstrong {
	public static void main(String[] args) {
		int num = 183;
		int temp=num;
		int sum = 0;
		int r =0;
		while(temp!=0)
		{
			r = temp %10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		System.out.println("the sum is=="+sum);
		System.out.println("the num is=="+num);
		if(sum == num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
