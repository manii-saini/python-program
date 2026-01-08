import javax.swing.*;
class Ifelse
{
	public static void main(String args[])
	{
		int a;
		a=Integer.parseInt(JOptionPane.showInputDialog("enetr a number"));
		if(a==1)
		{
			System.out.println("sunday");
		}
		elseif(a==2)
		{
			System.out.println("monday");
		}
		elseif(a==3)
		{
			System.out.println("tuesday");
		}
		elseif(a==4)
		{
			System.out.println("wensday");
		}
		elseif(a==5)
		{
			System.out.println("trusday");
		}
		elseif(a==6)
		{
			System.out.println("friday");
		}
		elseif(a==7)
		{
			System.out.println("satursday");
		}
		else
		{
			System.out.println("answer is wrong");
		}
	}
}
