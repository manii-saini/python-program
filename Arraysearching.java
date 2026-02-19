import javax.swing.*;
class Arraysearching
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int i,loc=-1,num;
		
		for(i=0;i<=9;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
		
		for(i=0;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a element to be searched"));
		for(i=0;i<=9;i++)
		{
			if(arr[i]==num)
			{
				loc=i+1;
				break;
			}
		}
		if(loc==-1)
		{
			System.out.println("element is not found");
		}
		else
		{
			System.out.println("element found at:"+loc);
		}
	}
}