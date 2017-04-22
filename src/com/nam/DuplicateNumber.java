package com.nam;
import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<10;i++)
		{
			list.add(i);
		}
		list.add(9);
		
		duplicateNumber(list);
	}

	private static void duplicateNumber(List<Integer> list) {
		
		int highestNumber = list.size() -1;
		int total = getSum(list);
		System.out.println("the total is=="+total);
		int duplicate = total - (highestNumber *(highestNumber+1)/2);
		System.out.println("the duplicate is=="+duplicate);
		
		
	}

	private static int getSum(List<Integer> list) {
		int sum =0;
		for (Integer i : list) {
			
			sum = sum + i;
			
		}
		return sum;
	}
	

}
