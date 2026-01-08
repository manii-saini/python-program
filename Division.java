import javax.swing.*;
class Division
{
	public static void main(String args[])
	{
		int a,b;
		int division=0;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		division=a/b;
		System.out.println("division of a and b is:"+division);
	}
}