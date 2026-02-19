import javax.swing.*;
class HCF
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
		end=1;
		for(i=start;i>=end;i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("The hcf is :"+i);
				break;
			}
		}
	}
}