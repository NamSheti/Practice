package com.nam;

public class TestDuplicateArray {
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,3,6};
		int j,i;
		int n = arr.length;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i] == arr[j])
				{
					break;
				}
			}
		
			if(i==j)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
