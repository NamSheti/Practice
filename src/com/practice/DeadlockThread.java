package com.practice;



public class DeadlockThread {
	String str1="nam";
	String str2="vin";
	
	Thread tr1 = new Thread()
			{
		public void run()
		{
			while(true)
			{
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + " "+str2);
						
					}
					
				}
			}
		}
		
			};
			
			Thread tr2 = new Thread()
			{
		public void run()
		{
			while(true)
			{
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + " "+str1);
						
					}
					
				}
			}
		}
		
			};
			
			public static void main(String[] args) {
				DeadlockThread dt = new DeadlockThread();
				dt.tr1.start();
				dt.tr2.start();
				
			}

}
