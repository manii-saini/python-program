import javax.swing.*;
class LCM
{
	public static void main(String args[])
	{
		int start,end,i,a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		
		if(a>b)
		{
			start=a;
		}
		else
		{
			start=b;
		}
		end=a*b;
		for(i=start;i<=end;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("The lcm is :"+i);
				break;
			}
		}
	}
}