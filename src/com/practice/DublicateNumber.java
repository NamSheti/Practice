package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DublicateNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//List<Integer> list = new ArrayList<>();
		for(int i=1;i<10;i++)
		{
			list.add(i);
		}
		list.add(9);
		
		dublicateNumber(list);
	}

	private static void dublicateNumber(List<Integer> list) {
		int highestnumber = list.size()-1;
		System.out.println("highets number=="+highestnumber);
		int total = getsum(list);
		System.out.println("the total="+total);
		int dublicate = total - (highestnumber*(highestnumber+1)/2);
		System.out.println(dublicate);
		
	}

	private static int getsum(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum =0;
		while(it.hasNext())
		{
			sum = sum +it.next();
		}
		return sum;
	}

}
