package methodoverloding;

class Example
{
	void add()
	{
		int a=5;
		int b=7;
		System.out.println("Addition is "+(a+b));
	}
	
	void add(int num1)
	{
		int a=num1;
		int b=7;
		System.out.println("Addition is "+(a+b));
	}
	
	void add(int num1,int num2)
	{
		int a=num1;
		int b=num2;
		System.out.println("Addition is "+(a+b));
	}
}
public class Method 
{
	public static void main(String args[])
	{
		Example e=new Example();
		e.add();
		e.add(9);
		e.add(4,9);
	}
}