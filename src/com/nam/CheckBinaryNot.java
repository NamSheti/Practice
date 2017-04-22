package com.nam;

public class CheckBinaryNot {
	public static void main(String[] args) {
		int num = 1015;
		int r = 0;
		boolean flag = true;
		while(num!=0)
		{
			r = num%10;
			if(r>1)
			{
				flag=false;
				break;
			}
			num = num /10;
		}
		if(flag == false)
		{
			System.out.println("not binary");
		}
		else
		{
			System.out.println("binary");
		}
	}

}
