package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DublicateCharacterString {
	public static void main(String[] args) {
		String str="namratha";
		dublicatecharacter(str);
	}

	private static void dublicatecharacter(String str) {
		HashMap<Character, Integer> dupmap = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if(dupmap.containsKey(c))
			{
				dupmap.put(c, dupmap.get(c)+1);
			}
			else
				dupmap.put(c, 1);
			
		}
		
		System.out.println(dupmap.size());
		Iterator it = dupmap.entrySet().iterator();
		while(it.hasNext())
		{
			@SuppressWarnings("unchecked")
			Map.Entry<Character,Integer> mpen = (Entry<Character,Integer>) it.next();
			System.out.println("the key "+mpen.getKey() + " " + mpen.getValue());
		}
		
		
	}

}
