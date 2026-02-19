import javax.swing.*;
class Twodarraycountnumber
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int i,j,pos=0,neg=0,zero=0;
	
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
				if(arr[i][j]>0)
				{
					pos++;
				}
				else if(arr[i][j]<0)
				{
					neg++;
				}
				else
				{
					zero++;
				}
			}
		}
	
		System.out.println("all positive number is :"+pos++);
		System.out.println("all negative number is:"+neg++);
		System.out.println("all zero number is :"+zero++);
	}
}