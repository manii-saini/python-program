import javax.swing.*;
class Armstrongenumber
{
	public static void main(String args[])
	{
		int num=0,cube,digit,sum=0,temp;
		temp=num;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		while(num>0)
		{
			digit=num%10;
			cube=digit*digit*digit;
			sum=sum+cube;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("The number is armstrong number");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
	}
}