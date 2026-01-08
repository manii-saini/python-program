import javax.swing.*;
class Digitofsum
{
	public static void main(String args[])
	{
		int num,sum=0,digit=0;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number "));
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
			System.out.println("sum of digit of n numbers is:"+sum);
	}
}