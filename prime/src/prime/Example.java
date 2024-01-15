package prime;

import java.util.Scanner;

public class Example 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int m,flag=0;
		System.out.print("Enter the Number:");
		int n=S.nextInt();
		if(n==0 || n==1)
		{
			System.out.println(n+" is not a Prime Number");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				m=n%i;
				if(m==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n+" is a prime number");
			else
			{
				System.out.println(n+" is Not a Prime Number");
			}
		}
		
	}
}