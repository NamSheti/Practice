package com.nam;

public class TestBubleSort {
	public static void main(String[] args) {
		int[] arr={3,6,8,1,5};
		int temp = 0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j=1;j<(arr.length-i);j++)
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
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
