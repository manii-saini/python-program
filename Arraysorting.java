import javax.swing.*;
class Arraysorting
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int i,j;
		for(i=0;i<=9;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a array number"));
		}
		for(i=0;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<=8;i++)
		{
			for(j=i+1;j<=9;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println("after the sorting elemnt ");
		
		for(i=0;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
	}
}