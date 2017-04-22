package com.nam;

public class TestReverseString {
	public static void main(String[] args) {
		String str="aba";
		
		String strr = reverseStr(str);
		System.out.println("the reverse is=="+strr);
		if(str.equals(strr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	private static String reverseStr(String str) {
		String reverse="";
		if(str.length()==0)
		{
			return str;
		}
		else
		{
			reverse = reverse + str.charAt((str.length()-1)) + reverseStr(str.substring(0, str.length()-1));
			
		}
		
		return reverse;
	}

}
