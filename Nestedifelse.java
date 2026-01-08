import javax.swing.*;
class Nestedifelse
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("enetr frist number"));
		System.out.println("enter the value of a:"+a);
		b=Integer.parseInt(JOptionPane.showInputDialog("enetr frist number"));
		System.out.println("enter the value of b:"+b);
		c=Integer.parseInt(JOptionPane.showInputDialog("enetr frist number"));
		System.out.println("enter the value of c:"+c);
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is biggest:"+a);
			}
			else
			{
				System.out.println("c is biggest:"+c);
			}
		}
		if(b>c)
		{
			if(b>a)
			{
				System.out.println("b is biggest:"+b);
			}
			else
			{
				System.out.println("c is biggest:"+c);
			}
		}
		
	}
}