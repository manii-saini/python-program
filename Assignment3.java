import java.util.Scanner;
class Assignment3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		float a,b,c;
		
		System.out.println("enter a three numbers");
		
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		
		if(a>b && a>c)
		{
			System.out.println("a is maximum:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is maximum:"+b);
		}
		else
		{
			System.out.println("c is maximum:"+c);
		}
	}
}