package com.practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="namratha";
		String data = reversString(str);
	}

	private static String reversString(String str) {
		String reverse="";
		if(str.length()==1)
		{
			reverse = str;
			System.out.println("the string is=="+reverse);
		}
		else
		{
			reverse += str.charAt(str.length()-1) + reversString(str.substring(0,str.length()-1));
			System.out.println("the reverse string is=="+reverse);
		}
		return reverse;
		
	}

}
