import javax.swing.*;
class Whilesumevenoddnumber

{
	public static void main(String args[])
	{
		int i=1,num,sum1=0,sum2=0,sum=0;
		while(i<=10)
		{
			num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			if(num%2==0)
			{
				sum1=sum1+num;
			}
			else
			{
				sum2=sum2+num;
			}
			i++;
		}
		sum=sum1+sum2;
		System.out.println("sum of all even number is:"+sum);
	}
}