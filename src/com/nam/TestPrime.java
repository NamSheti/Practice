package com.nam;

public class TestPrime {
	public static void main(String[] args) {
		int num=37;
		boolean flag = false;
		for(int i=2; i<num/2;i++)
		{
			if(num % i ==0)
			{
				flag = true;
				break;
				
			}
			else
				flag = false;
		}
		
		if(flag==true)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}

}
