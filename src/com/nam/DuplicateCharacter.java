package com.nam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {
	public static void main(String[] args) {
		duplicateChar("namratha");
		
	}

	private static void duplicateChar(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Character, Integer> hash = (Entry<Character, Integer>) iterator.next();
			if(hash.getValue() > 1)
			{
			System.out.println("the key and value is   "+hash.getKey()+ " "+hash.getValue());
			}
		}
		
	}

}
