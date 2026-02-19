import javax.swing.*;
class Twodarrayplandromesum
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int i=0,j=0,digit,rev=0,sum=0;
		int temp=arr[i][j];
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a array elemnt"));
			}
		}

		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
			}
				System.out.println();
		}
		for(i=0;i<=2;i++)
		{
		for(j=0;j<=2;j++)
		{
		while(arr[i][j]>0)
		{
			digit=arr[i][j]%10;
			rev=(rev*10)+digit;
			arr[i][j]=arr[i][j]/10;
		}
		if(temp==rev)
		{
			sum=sum+arr[i][j];
		}
		}
		}
			System.out.println("sum of all plandrome number:"+sum);
	}
}