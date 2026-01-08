import javax.swing.*;
class Perfectnumber
{
	public static void main(String args[])
	{
		int i,num,sum=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("The number is perfect:"+num);
		}
		else
		{
			System.out.println("The number is not perfect:"+num);
		}
	}
}