package com.nam;

import java.util.Arrays;

public class TestSortString {
	//Using String API
	/*public static void main(String[] args) {
		String str = "namratha";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);;
		System.out.println(ch);
	}*/
	
	//without using String api
	public static void main(String[] args) {
		char temp;
		String str = "namratha";
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(ch[i] > ch[j])
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
	}

}
