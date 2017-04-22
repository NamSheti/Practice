package com.practice;

public class TopTwoMax {
	public static void main(String[] args) {
		int[] arr = {2,5,7,1};
		topNumber(arr);
	}

	private static void topNumber(int[] arr) {
		int maxOne=0;
		int maxTwo=0;
		for (int n : arr) {
			if(maxOne < n)
			{
				
				maxTwo = maxOne;
				maxOne = n;
			}
			else if(maxTwo < n)
			{
				maxTwo = n;
			}
			
			
		}
		System.out.println(maxOne);
		System.out.println(maxTwo);
		
	}
	

}
