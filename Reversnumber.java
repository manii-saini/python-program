import javax.swing.*;
class Reversnumber
{
	public static void main(String args[])
	{
		int num,digit=0,rev=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
			System.out.println("The revers number is :"+rev);
	}
}