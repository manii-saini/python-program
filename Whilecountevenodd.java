import javax.swing.*;
class Whilecountevenodd
{
	public static void main(String args[])
	{
		int i,num,even=0,odd=0;
		i=1;
		while(i<=10)
		{
			//num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		i++;
		System.out.println("total even numbers:"+even++);
		System.out.println("total odd numbers:"+odd++);

	}
}