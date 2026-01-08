import javax.swing.*;
class Plandromenumber
{
	public static void main(String args[])
	{
		int num=0,digit=0,rev=0;
		int temp=num;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("The number is plandrome:"+temp);
		}
		else
		{
			System.out.println("The number is not plandrome:"+temp);
		}
	
	}
}