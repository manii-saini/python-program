import javax.swing.*;
class Fabonanciterm
{
	public static void main(String args[])
	{
		int a,b,limit,c;
		a=0;
		b=1;
		System.out.print(a);
		System.out.print(b);
		do
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
		while(c<=20);
	}
}