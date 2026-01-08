import javax.swing.*;
class Functiontype2
{
	public static void sum(int a,int b)
	{
		int ans;
		ans=a+b;
		System.out.println("ans="+ans);
	}
	
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		sum(a,b);
	}
}