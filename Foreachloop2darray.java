import javax.swing.*;
class Foreachloop2darray
{
	public static void main(String args[])
	{
		int arr[][]=new int[5][5];
		int i,j;
		
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=4;j++)
			{
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter a array numbers"));
			}
		}
		for(int k[]:arr)
		{
			for(int p:k)
			{
			
				System.out.print(p);
			}
				System.out.println();
		}
	}	
}