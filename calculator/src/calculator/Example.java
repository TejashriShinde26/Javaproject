package calculator;

import java.util.Scanner;

public class Example
{
	Scanner S=new Scanner(System.in);
	void add()
	{
		System.out.print("Enter Number 1:");
		int a=S.nextInt();
		System.out.print("Enter Number 2:");
		int b=S.nextInt();
		System.out.println("Addition is "+(a+b));
	}
	
	void Sub()
	{
		System.out.print("Enter Number 1:");
		int a=S.nextInt();
		System.out.print("Enter Number 2:");
		int b=S.nextInt();
		System.out.println("Subtraction is "+(a-b));
	}
	
	void mult()
	{
		System.out.print("Enter Number 1:");
		int a=S.nextInt();
		System.out.print("Enter Number 2:");
		int b=S.nextInt();
		System.out.println("Multiplication is "+(a*b));
	}
	
	void div()
	{
		System.out.print("Enter Number 1:");
		float a=S.nextInt();
		System.out.print("Enter Number 2:");
		float b=S.nextInt();
		System.out.println("Division is "+(a/b));
	}
	
	public static void main(String args[])
	{
		Example e=new Example();
		Scanner S=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n1.Add\n2.subtraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println(" ");
			System.out.print("Enter the Choice:");
			choice=S.nextInt();
			switch(choice)
			{
			case 1:
				e.add();
				break;
			case 2:
				e.Sub();
				break;
			case 3:
				e.mult();
				break;
			case 4:
				e.div();
				break;
			case 5:
				System.out.println("Thank You!!!!!!!");
				System.exit(1);
				break;
			default:
				System.out.println("Wrong Choice!!!!!");
			}
		}
		while(choice!=5);
	}
}
