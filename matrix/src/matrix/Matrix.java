package matrix;

import java.util.Scanner;

public class Matrix 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the Number of Row:");
		int row=S.nextInt();
		System.out.print("Enter the Number of Column:");
		int column=S.nextInt();
		
		int a[][]=new int[row][column];
		int b[][]=new int[row][column];
		int c[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the Elements:");
				a[i][j]=S.nextInt();
			}
		}
	System.out.println("\nFor Second Matrix\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the Elements");
				b[i][j]=S.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println("");
		}


	}
}
