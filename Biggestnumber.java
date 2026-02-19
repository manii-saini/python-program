import javax.swing.*;
class Biggestnumber
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("enetr frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enetr second number"));
		c=Integer.parseInt(JOptionPane.showInputDialog("enetr three number"));
		if(a>b&&a>c)
		{
			System.out.println("a is biggest:"+a);
		}
		if(b>a&&b>c)
		{
			System.out.println("b is biggest:"+b);
		}
		else
		{
			System.out.println("c is biggest:"+c);
		}
	}
}