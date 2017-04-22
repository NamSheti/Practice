package com.nam;

public class insertionSort {
	public static void main(String[] args) {
		int[] arr = {2,3,6,1,4,9};
		int n = arr.length;
		int temp = 0;
		for(int j =1;j<n;j++)
		{
			int key = arr[j];
			int i = j-1;
			while((i > -1) && (arr[i] > key))
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
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
