import javax.swing.*;
class Dowhilemaxnumber
{
	public static void main(String args[])
	{
		int i=1,num,max1=0,max2=0;
		do
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(i==1)
			{
				max1=num;
			}
			else if(num>max1)
			{
				max2=max1;
				max1=num;
			}
			else if(num>max2)
			{
				max2=num;
			}
			i++;
		}
		while(i<=10);
		System.out.println("The frist  maximum number is :"+max1);
		System.out.println("The frist  maximum number is :"+max2);
	}
}