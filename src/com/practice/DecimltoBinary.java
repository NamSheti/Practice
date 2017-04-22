package com.practice;

public class DecimltoBinary {
	
	public static void main(String[] args) {
		int num=25;
		decimatobinary(num);
	}

	private static void decimatobinary(int num) {
		System.out.println("the number vlues iss=="+num);
		int[] bin = new int[25];
		int index=0;
		while(num > 0)
		{
			bin[index++] = num%2;
			//System.out.println("dfff"+bin[0]);
			num = num / 2;
			//System.out.println(num);
		}
		//System.out.println(bin.length);
		for(int i=index-1;i >=0 ;i--)
		{
			System.out.println(bin[i]);
		}
		
	}

}
