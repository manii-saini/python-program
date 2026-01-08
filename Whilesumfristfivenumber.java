import javax.swing.*;
class Whilesumfristfivenumber
{
	public static void main(String args[])
	{
		int i=1,sum=0;
		int num;
		while(i<=10)
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(i<=5)
			{
				sum=sum+num;
			}
			i++;
		}
			System.out.println("sum of frist five numbers is:"+sum);
		
	}
}