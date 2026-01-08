import javax.swing.*;
class Whilecountelseif
{
	public static void main(String args[])
	{
		int i=1,num,even=0,odd=0;
		while(i<=10)
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enetr a number"));
			if(num%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			i++;
		}
			System.out.println("count all even numbers is:"+even++);
			System.out.println("count all odd numbers is:"+odd++);
	}
}