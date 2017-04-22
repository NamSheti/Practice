package com.nam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestSortReverseList {
	/*public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(9);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
	}*/
	
	public static void main(String[] args) {
		
		print(0);
		
	}

	private static void print(int n) {
		//n=0;
		if(n<=10)
		{
			System.out.println(n);
			//n++;
			print(++n);
			
		}
		
		
	}
	
	
	
}
