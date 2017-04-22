package com.nam;

public class TestReverseNumber {
	public static void main(String[] args) {
		int num = 434;
		int rrs = reverseNum(num);
		System.out.println("the reverse number is=="+rrs);
		if(rrs == num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	private static int reverseNum(int num) {
		
		int reverse = 0;
		while(num!=0)
		{
			reverse = ((reverse*10) + (num%10));
			num = num /10;
		}
		return reverse;
	}

}
