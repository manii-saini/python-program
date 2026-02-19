import javax.swing.*;
class Arraydeletion
{
	public static void main(String[] args)
	{

		int[] arr=new int[10];
		int i,loc=-1,value;
		
		for(i=0;i<=9;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enetr a  array elemnt"));
		}
		
		for(i=0;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
		value=Integer.parseInt(JOptionPane.showInputDialog("enter a value to be sarch"));
		for(i=0;i<=9;i++)
		{
			if(arr[i]==value)
			{
				loc=i;
				break;
			}
		}
		if(loc==-1)
		{
			System.out.println("element is not found");
		}
		else
		{
				for(i=loc;i<=8;i++)
				{
					arr[i]=arr[i+1];
				}
		}
		
		System.out.println("after the deletion");
		
		for(i=0;i<=8;i++)
		{
			System.out.println(arr[i]);
		}
	}
}