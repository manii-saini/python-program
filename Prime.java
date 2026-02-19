import javax.swing.*;
class Prime
{
	public static void main(String args[])
	{
		
		int i,num,flag=1;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter your number"));
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("number is prime:"+num);
		}
		else
		{
			System.out.println("The number is not prime:"+num);
		}
	}
}