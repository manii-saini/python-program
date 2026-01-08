import javax.swing.*;
class Dowhilecountallnumber
{
	public static void main(String args[])
	{
		int i=1,num,pos=0,neg=0,zero=0;
		do
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(num>0)
			{
				pos++;
			}
			else if(num<0)
			{
				neg++;
			}
			else
			{
				zero++;
			}
			i++;
		}
		while(i<=10);
		System.out.println("count all positive number is:"+pos++);
		System.out.println("count all odd number is :"+neg++);
		System.out.println("count all zero number is:"+zero++);
	}
}