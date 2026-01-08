import javax.swing.*;
class Functiontype1
{
	public static void factorial()
	{
		int num,fact=1,i;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
			System.out.println("Factorial:"+fact);
	}
	
	public static void main(String args[])
	{
		factorial();
	}
}