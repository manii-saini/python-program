import javax.swing.*;
class Functiontype4
{
	public static int add(int a,int b)
	{
		int ans;
		ans=a+b;
		return ans;
	}
	
	public static void main(String args[])
	{
		
		int a,b,ans;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a second number"));
		ans=add(a,b);
		System.out.println("sum="+ans);
	}
}