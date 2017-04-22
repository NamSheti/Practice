package com.nam;


//sum of power of 2
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int r;
		int sum=0;
		int num=10;
		int power=0;
		while(num!=0)
		{
			r = num % 10;
			sum = (int) (sum + r * Math.pow(2, power));
			num = num / 10;
			power++;
		}
		System.out.println(sum);
		
	}

}
