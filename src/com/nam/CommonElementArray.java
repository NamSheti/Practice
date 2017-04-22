package com.nam;

import java.util.ArrayList;
import java.util.List;

public class CommonElementArray {
	public static void main(String[] args) {
		int[] arra1 = {1,2,3,4,5};
		int[] arra2 = {3,5,7,8,9,6};
		commonArray(arra1,arra2);
	}

	private static void commonArray(int[] arra1, int[] arra2) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arra1.length;i++)
		{
			for(int j=0;j<arra2.length;j++)
			{
				if(arra1[i] == arra2[j])
				{
					System.out.println("the common element is=="+arra1[i]);
					list.add(arra1[i]);
				}
				else
				{
					System.out.println("No Common Element");
				}
			}
		}
		System.out.println(list);
		
	}

}
