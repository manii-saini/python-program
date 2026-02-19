import javax.swing.*;
class Factorial
{
	public static void main(String args[])
	{
		int i,num,f=1;
		num=Integer.parseInt(JOptionPane.showInputDialog("enetr a number"));
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
			System.out.println("factorial="+f);
	}

}