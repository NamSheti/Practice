package com.nam;

public class FindMiddleIndex {
	public static void main(String[] args) {
		 int[] num = { 2, 4, 4, 5, 4, 1,5 };
		 middleindex(num);
	}

	private static void middleindex(int[] num) {
		int endIndex = num.length - 1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		while(true)
		{
			if(sumLeft > sumRight)
			{
				sumRight = sumRight + num[endIndex--];
			}
			else 
			{
				sumLeft = sumLeft + num[startIndex++];
			}
			
		
		
		if(startIndex > endIndex)
		{
			if(sumLeft ==sumRight)
			{
				break;
			}
			else
			{
				System.out.println("send proper array");
			}
		}
		
	}
		System.out.println("the end index is=="+endIndex);
	}

}
