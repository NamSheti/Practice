package com.nam;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = reverseNumber(456);
		System.out.println("the reverse number is=="+n);
	}

	private static int reverseNumber(int num) {
		int reverse = 0;
		while(num != 0)
		{
			reverse = (reverse*10) + (num %10);
			num = num / 10;
			//reverseNumber(num/10);
			System.out.println("the reverse number is=="+reverse);
		}
		
		return reverse;
	}

}
