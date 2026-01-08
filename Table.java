import javax.swing.*;
class Table
{
	public static void main(String args[])
	{
		int i,num;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}