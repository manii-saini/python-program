import javax.swing.*;
class Twodarraycountprimenumber
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int i,j,flag=1,count=0;
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enetr a array element"));
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
		int k;
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				for(k=2;k<arr[i][j];k++)
				{
					if(arr[i][j]%k==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					count++;
				}
				
			}
		}
		
		System.out.println("all prime number is:"+count++);
	}
}