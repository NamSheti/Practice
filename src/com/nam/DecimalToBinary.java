package com.nam;

public class DecimalToBinary {
	public static void main(String[] args) {
		binaryConversion(25);
	}

	private static void binaryConversion(int num) {
		System.out.println(num);
		int[] arr = new int[5];
		int index=0;
		while(num !=0)
		{
			arr[index++] = num % 2;
			num = num / 2;
		}
		
		for(int k=arr.length-1;k >= 0;k--)
		{
			System.out.println(arr[k]);
		}
		
	}

}
