package com.nam;

public class TestAddMatrix {
	
	public static void main(String[] args) {
		int[][] mat1 = {{2,3,5,6},{6,0,4,3}};
		int[][] mat2 = {{1,2,3,3},{2,0,6,7}};
		int[][] rest = new int[2][4];
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[0].length;j++)
			{
				
				rest[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		for(int i=0;i<rest.length;i++)
		{
			for(int j=0;j<rest[0].length;j++)
			{
				System.out.println(rest[i][j]);
			}
		}
	}

}
