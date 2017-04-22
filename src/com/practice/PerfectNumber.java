package com.practice;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 6;
		//boolean data = 
				perfectNumber(num);
		//System.out.println(data);
	}

	private static void perfectNumber(int num) {
		int res = 0;
		for(int i=1;i<num / 2; i++)
		{
			if(num%i==0)
			{
				//return true;
				
				res = 1;
			}
			else 
				//return false;
				
				res = 0;
		}
		if(res ==1)
		{
			System.out.println("Perfect");
		}
		else
			System.out.println("not");
		
	}

}
