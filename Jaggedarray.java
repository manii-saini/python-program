import javax.swing.*;
class Jaggedarray
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][];
		int i,j;
		
		arr[0]=new int[3];
		arr[1]=new int[5];
		arr[2]=new int[4];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}