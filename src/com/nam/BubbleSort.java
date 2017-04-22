package com.nam;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,3,6,1,4,9};
		int n = arr.length;
		int temp = 0;
		for(int i =0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			printNumber(arr);
		}
	}

	private static void printNumber(int[] arr) {
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
