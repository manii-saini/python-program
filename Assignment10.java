class Number
{
	private int number;
	private static int count=0;
	
	public Number(int n)
	{
		number=n;
		count++;
	}
	
	public void displaynum()
	{
		System.out.println("number="+number);
		
	}
	public static void displaycount()
	{
		System.out.println("objected is created:"+count);
	}
}
	
public class Assignment10
{
	public static void main(String args[])
	{
		Number n1=new Number(10);
		Number n2=new Number(20);
		Number n3=new Number(30);
		n1.displaynum();
		n2.displaynum();
		n3.displaynum();
		Number.displaycount();
		
		
		
		
	}
}