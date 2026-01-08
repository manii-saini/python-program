//A 
//A B
//A B C
//A B C D
//A B C D E

import javax.swing.*;
class Pattern9
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			k=65;
			for(j=1;j<=i;j++)
			{
				System.out.print((char)k);
				k++;
			}
				System.out.println(" ");
		}
	}
}