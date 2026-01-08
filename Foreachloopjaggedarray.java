import javax.swing.*;
class Foreachloopjaggedarray
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][];
		int i,size,j;
	
		for(i=0;i<=2;i++)
		{
			size=Integer.parseInt(JOptionPane.showInputDialog("enter size of row"));
			arr[i]=new int[size];
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
			}

		}
	
		for(int k[]:arr)
		{
			for(int p:k)
			{
				System.out.print("\t"+p);
			}
			System.out.println();
		}
	}
}