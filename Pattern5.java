//5 4 3 2 1
//4 3 2 1 
//3 2 1 
//2 1
//1

import javax.swing.*;
class Pattern5
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			k=5;
			for(j=1;j<=6-i;j++)
			{
				System.out.print(k);
				k--;
			}
				System.out.println(" ");
		}
	}
}