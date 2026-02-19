import javax.swing.*;
class Arrayinsertion
{
	public static void main(String[] args)
	{
		int[] arr=new int[11];
		int i,value,loc;
		
		for(i=0;i<=9;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a array element"));
		}
	
		for(i=0;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
		value=Integer.parseInt(JOptionPane.showInputDialog("enter a value to be insert"));
		
		loc=Integer.parseInt(JOptionPane.showInputDialog("which location insert the elemnt"));
	
		loc--;
		
		for(i=9;i>=loc;i--)
		{
			arr[i+1]=arr[i];	
		}
		arr[loc]=value;
		
		System.out.println("after insert the element");
		
		for(i=0;i<=10;i++)
		{
			System.out.println(arr[i]);
		}
	}
}