//   	  $
//      $ * $   
//    $ * $ * $  
//  $ * $ * $ * $  
//$ * $ * $ * $ * $ 

import javax.swing.*;
class Pattern10
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
			for(j=1;j<=(2*i-1);j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("$");
				}
			}
				System.out.println(" ");
		}
	}
}