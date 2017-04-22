package com.practice;

import java.util.Scanner;

public class hyd {

	
		public static void main(String args[]) {
			int sum =0;
	        

	        Scanner s = new Scanner(System.in);
	        String name=s.next();
	        System.out.println(name);
	        
	        for (int i = 0; i < name.length(); i++) {
	            
	            sum = sum +i;
	           
	        }
	        
	        System.out.println(sum);
		}
}
