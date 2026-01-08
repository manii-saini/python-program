import javax.swing.*;
class Dowhilemaxnumber
{
	public static void main(String args[])
	{
		int i=1,num,max=0;
		do
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(i==1)
			{
				max=num;
			}
			else if(num>max)
			{

				max=num;
			}
			i++;
		}
		while(i<=10);
		System.out.println("The maximum number is :"+max);
	}
}