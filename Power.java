import javax.swing.*;
class Power
{
	public static void main(String args[])
	{
		int i,num,base,ans=1;
		base=Integer.parseInt(JOptionPane.showInputDialog("enter your base"));
		num=Integer.parseInt(JOptionPane.showInputDialog("enetr your numbers"));
		for(i=1;i<=num;i++)
		{
			ans=ans*base;
		}
			System.out.println("power of "+base+"^"+num+"is:"+ans);
	}
}