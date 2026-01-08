import javax.swing.*;
class Subtruction
{
	public static void main(String args[])
	{
		int a,b;
		int sub=0;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		sub=a-b;
		System.out.println("division of a and b is:"+sub);
	}
}