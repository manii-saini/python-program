import javax.swing.*;
class sum

{
	public static void main(String args[])
	{
	int a,b;
	a=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	b=Integer.parseInt(JOptionPane.showInputDialog("enter b number"));
	int sum=0;
	sum=a+b;
	System.out.println("sum of a and b is:"+sum);
	}
}