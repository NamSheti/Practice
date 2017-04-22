package com.practice;

public class MiddleIndexArray {
	public static void main(String[] args) {
		int[] arr = {2,4,4,5,4,1};
		int data = middleIndex(arr);
	}
	
	
	
	private static int middleIndex(int[] arr) {
		int endIndex = arr.length -1;
		int startIndex=0;
		int sumLeft=0;
		int sumRight=0;
		while(true)
		{
			if(sumLeft > sumRight)
			{
				sumRight += arr[endIndex--];
			}
			else
				sumLeft += arr[startIndex++];
		
		if(startIndex > endIndex)
		{
			if(sumLeft == sumRight)
			{
				break;
			}
			else
			{
				System.out.println("send a proper array");
			}
		}
		}
		System.out.println("the index is=="+endIndex);
		return endIndex;
	}

}
