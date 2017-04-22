package com.nam;

public class TestMulMatrix {
	
	//condition to check : first matrix column should be equal to second matrix row.
	//The result of the matrix will be first matrix column and second matrix row.
	public static void main(String[] args) {
		int[][] mat1 = {{1,3,4},{2,5,6}};
		int[][] mat2 = {{1,5,6},{2,5,4},{1,1,1}};
		int m = mat1.length; //mat1 number of rows
		int n = mat1[0].length; //mat1 number of column
		
		int p = mat2.length; //mat2 number of rows
		int q = mat2[0].length; //mat2 number of column
		int[][] rest = new int[m][q];
		if(n!=p)
		{
			System.out.println("the multiplication is not posible");
		}
		else
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<p;k++)
					{
						rest[i][j] = rest[i][j] + mat1[i][k] * mat2[k][j];
					}
				}
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
