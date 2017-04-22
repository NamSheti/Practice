package com.nam;

public class StringToInt {
	public static void main(String[] args) {
		String s = "76289";
		int sum=0;
		char[] ch = s.toCharArray();
		int zeroAsci = (int)'0';
		
		for (char c : ch) {
			int temsci = (int)c;
			sum = (sum *10) + (temsci - zeroAsci);
			
		}
		System.out.println("the int is=="+sum);
	}

}
