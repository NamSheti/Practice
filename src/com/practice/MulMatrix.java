package com.practice;

public class MulMatrix {
	public static void main(String[] args) {
		
		int[][] mat1 = {{1,2,3},{1,2,3}};
		int[][] mat2 = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] res = new int[2][3];
		int m = mat1.length;
		int n = mat1[0].length;
		int p = mat2.length;
		int q = mat2[0].length;
		if(n!=p)
		{
			System.out.println("Send a proper matrix");
		}
		else
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<q;k++)
					{
						res[i][j] = res[i][j] + mat1[i][k] * mat2[k][j];
					}
				}
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
