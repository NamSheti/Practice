package com.practice;

public class CommonEleArray {
	public static void main(String[] args) {
		int[] arr1 = {5,8,9,7,3};
		int[] arr2 = {7,1,0,2,3,5};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
						{
							System.out.println("the common element is=="+arr1[i]);
						}
			}
		}
		
	}
	

}
