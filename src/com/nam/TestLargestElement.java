package com.nam;

public class TestLargestElement {
	public static void main(String[] args) {
		int[] arr = {54,23,126,96,86,83};
		int max =0;
		for(int i =0;i<arr.length;i++)	
		{
			if(arr[i] > max)
			{
				max= arr[i];
			}
		}
		System.out.println("the maximum element is=="+max);
	}

}
