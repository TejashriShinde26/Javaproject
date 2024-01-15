package Rect;

import java.util.Scanner;
class Rectangle
{
	double length,width,area;
	String color;
	Scanner S=new Scanner(System.in);
	void get_length()
	{
		System.out.print("Enter the Length:");
		length=S.nextDouble();
	}
	void get_width()
	{
		System.out.print("Enter the Width:");
		width=S.nextDouble();
	}
	String get_color()
	{
		System.out.print("Enter the Color:");
		color=S.next();
		return color;
	}
	double find_area()
	{
		area=length*width;
		return area;
	}
}
public class Example
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.get_length();
		r1.get_width();
		String color1=r1.get_color();
		double area1=r1.find_area();
		
		r2.get_length();
		r2.get_width();
		String color2=r2.get_color();
		double area2=r2.find_area();
		
		if(area1==area2 && color1.equalsIgnoreCase(color2))
		{
			System.out.println("Both are Matching");
		}
		else
		{
			System.out.println("NOt MAtching");
		}
			
	}
}