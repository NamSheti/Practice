package com.nam;

public class PerfectNumber {
	public static void main(String[] args) {
		perfect(6);
	}

	private static void perfect(int num) {
      int sum =0;
      for(int i=1;i<=num/2;i++)
      {
    	  if(num%i==0)
    	  {
    		  sum = sum + i;
    	  }
    	  System.out.println(sum);
    }
      
      if(sum==num)
      {
    	  System.out.println("perfect");
      }
		
	}

}
