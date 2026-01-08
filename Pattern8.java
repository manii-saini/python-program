//* * * * * 
// * * * *
//  * * *
//   * *
//    *

import javax.swing.*;
class Pattern8
{
	public static void main(String args[])
	{
		int i,j,k,sp;
		for(i=1;i<=5;i++)
		{
			for(sp=1;sp<=i-1;sp++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" *");

			}
				System.out.println(" ");
		}
	}
}