import javax.swing.*;
class Whilesumevennumber

{
	public static void main(String args[])
	{
		int i=1,num,sum=0;
		while(i<=10)
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(num%2==0)
			{
				sum=sum+num;
			}
			i++;
		}
		System.out.println("sum of all even number is:"+sum);
	}
}