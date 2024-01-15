package constructor;

class Rectangle 
{
	double length,width;
	
	Rectangle()
	{
		length=5.2;
		width=2.3;
	}
	Rectangle(double a)
	{
		length=a;
		width=6.4;
	}
	Rectangle(double a,double b)
	{
		length=a;
		width=b;
	}
	
	void display()
	{
		System.out.println("length="+length+ "and width="+width);
	}
}

public class Constructor
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.display();
		
		Rectangle r2=new Rectangle(6.7);
		r2.display();
		
		Rectangle r3=new Rectangle(5.4,7.9);
		r3.display();
		
	}
}
