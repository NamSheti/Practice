package com.nam;

public class DistinctArray {
	public static void main(String[] args) {
		int[] arr = {8,5,3,1,3};
		int n = arr.length;
		int[] disct = new int[10];
		int index=0;
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
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
