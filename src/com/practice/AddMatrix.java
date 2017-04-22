package com.practice;

public class AddMatrix {
	public static void main(String[] args) {
		int[][] mat1 = {{1,2,3},{1,2,3}};
		int[][] mat2 = {{1,2,3},{1,2,3}};
		int[][] res = new int[2][3];
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[0].length;j++)
			{
				res[i][j] = mat1[i][j] + mat2[i][j]; 
			}
		}
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.println(res[i][j]);
			}
		}
	}

}
