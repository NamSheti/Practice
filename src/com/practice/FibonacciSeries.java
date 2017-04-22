package com.practice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int fibcount=15;
		int[] fib = new int[50];
		fib[0]=0;
		fib[1] = 1;
		for(int i=2;i<fibcount;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		for (int i : fib) {
			System.out.println(i);
			
		}
		
	}

}
