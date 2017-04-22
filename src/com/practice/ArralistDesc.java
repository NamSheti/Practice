package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArralistDesc {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}

}
