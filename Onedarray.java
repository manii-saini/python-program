import javax.swing.*;
class Onedarray
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a array number"));
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}