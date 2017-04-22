package com.practice;

public class Pramid {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.println("* ");
			}
			for(int j=0;j<5-i;j++)
			{
				System.out.println("-");
			}
			System.out.println();
		}
	}

}
