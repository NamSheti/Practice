package com.nam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestOcuCharacterString {
	
	//number of character in String
	/*public static void main(String[] args) {
		String str="namratha";
		int count=0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			
			count++;
			
		}
		
		System.out.println(count);
		
	}
*/
	
	//number of occurance character in string
	public static void main(String[] args) {
		String str="namratha";
		int count=0;
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			
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
			Map.Entry<Character, Integer> it = (Entry<Character, Integer>) iterator.next();
			System.out.println("the key=="+it.getKey() + " " + it.getValue());
			
		}
		
	}
}
