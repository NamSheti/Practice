package com.nam;

public class SwapNumber {
	public static void main(String[] args) {
		swapNumber(47,39);
	}

	private static void swapNumber(int a, int b) {
		a = a + b;
		b = a -b;
		a = a-b;
		
		System.out.println("the a value is=="+a);
		System.out.println("the b value is=="+b);
		
	}

}
