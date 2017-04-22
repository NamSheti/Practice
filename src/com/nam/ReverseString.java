package com.nam;

public class ReverseString {
	public static void main(String[] args) {
		String str = reverseString("namratha");
		System.out.println("the reverse main is=="+str);
	}

	private static String reverseString(String str) {
		String reverse = "";
		
		if(str.length()==1)
		{
			reverse = str;
		}
		else
		{
			reverse = reverse + str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
			System.out.println("the reverse is=="+reverse);
		}
		return reverse;
		
		
	}

}
