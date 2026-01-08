import javax.swing.*;
class Countnumberelseif
{
	public static void main(String args[])
	{
		int i=0,num,even=0,odd=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		if(num%2==0)
		{
			even++;
		
		}
		else
		{
			odd++;
		}
		i++;
				System.out.println("count all even numbers:"+even++);
		System.out.println("count all odd numbers  :"+odd++);
	}

}