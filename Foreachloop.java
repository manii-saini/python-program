import javax.swing.*;
class Foreachloop
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int i;
		
		for(i=0;i<=9;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter a array numbers"));
		}
		for(int k:arr)
		{
			System.out.println(k);
		}
	}	
}