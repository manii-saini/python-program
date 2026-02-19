import javax.swing.*;
class Onedarraysum
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
		int sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);
	}
}