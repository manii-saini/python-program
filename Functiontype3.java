import javax.swing.*;
class Functiontype3
{
	public static int addition()
	{
		int a,b,ans;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter a frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a second number"));
		
		ans=a+b;
		return ans;
	}
	
	public static void main(String args[])
	{
		int ans;
		ans=addition();
		System.out.println("sum="+ans);
	}
}