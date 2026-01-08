//     *
//    * *
//   * * *
//  * * * *
// * * * * *

import javax.swing.*;
class Pattern7
{
	public static void main(String args[])
	{
		int i,j,sp;
		for(i=1;i<=5;i++)
		{
		    for(sp=1;sp<=5-i;sp++)
		    {
				System.out.print(" ");
		     }
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
				System.out.println(" ");
		}
	}
}