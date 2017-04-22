package com.nam;

public class TestFibonacci {
	public static void main(String[] args) {
		int febcount = 15;
		int[] feb = new int[15];
		feb[0] = 0;
		feb[1] = 1;
		for(int i=2;i<febcount;i++)
		{
			feb[i] = feb[i-1] + feb[i-2];
		}
		
		for (int i : feb) {
			
			System.out.println(i);
		}
	}

}
