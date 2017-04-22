package com.nam;

public class TopTwoMaximumNumber {
	public static void main(String[] args) {
		int[] arr = {23,56,89,453,69};
		top2max(arr);
	}

	private static void top2max(int[] arr) {
		int maxone = 0;
		int maxtwo = 0;
		for(int i=0;i<arr.length;i++)
		{
			int n = arr[i];
			if(maxone < n)
			{
				maxtwo = maxone;
				maxone = n;
			}else if(maxtwo < n)
			{
				maxtwo = n;
			}
				
		}
		
		System.out.println("the maxone is=="+maxone);
		System.out.println("the maxtwo is=="+maxtwo);
		
	}

}
