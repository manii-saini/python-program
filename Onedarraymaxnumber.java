import javax.swing.*;
class Onedarraymaxnumber
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int i,max=0;
		for(i=0;i<=4;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a array number"));
		}
		for(i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		if(i==0)
		{
			max=arr[i];
		}
		else if(arr[i]>max)
		{
			max=arr[i];
		}
			System.out.println("maximum number :"+max);
	}
}