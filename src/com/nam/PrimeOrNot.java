package com.nam;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean s = prime(7);
		System.out.println(s);
	}

	private static boolean prime(int num) {
		for(int i=2;i<num/2;i++)
		{
			if(num %i==0)
			{
				return false;
			}
			
				
			
		}
		return true;
		
	}

}
