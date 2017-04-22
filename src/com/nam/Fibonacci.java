package com.nam;

public class Fibonacci {
	public static void main(String[] args) {
		fibonacci(15);
	}

	private static void fibonacci(int num) {
		int[] fib = new int[15];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<num;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for (int i : fib) {
			
			System.out.println(i);
			
		}
		
	}

}
