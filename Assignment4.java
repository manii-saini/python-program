import java.util.Scanner;
import javax.swing.*;
class Assignment4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int choice,i;
		System.out.println("Enter 1 to Display");
		System.out.println("Enter 2 to Searching");
		System.out.println("Enter 3 to Sorting");
		System.out.println("Enter 4 to Reverse");
		System.out.println("Enter 5 to maximum");
		System.out.println("Enter 6 to exit");
		while(true)
		{
		int arr[]={2,4,7,9,5,6,10,1,8,3};
		choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
		switch(choice)
		{
			case 1:
			System.out.println("Display Array numbers");
			for(i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			break;
			
			case 2:
				int value,loc=-1;
		
				System.out.println("Enter a value to be search");
				value=s.nextInt();
				for(i=0;i<arr.length;i++)
				{
					if(arr[i]==value)
					{
					loc=i+1;
					break;
					}
				}
				if(loc==-1)
				{
					System.out.println("Element is not Found");
				}
				else
				{
					System.out.println("Element found at:"+loc);
				}
				break;
		
				case 3:
						int j;
						for(i=0;i<=8;i++)
						{
							for(j=i+1;j<=9;j++)
							{
								if(arr[i]>arr[j])
								{
									int temp=arr[i];
									arr[i]=arr[j];
									arr[j]=temp;
								}
							}
						}
		
						System.out.println("After the sorting");
						for(i=0;i<=9;i++)
						{
						System.out.println(arr[i]);
						}
				                break;
			
				case 4:
					for(i=0;i<=8;i++)
					{
						for(j=i+1;j<=9;j++)
						{
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
		
					System.out.println("After the rivers");
					for(i=0;i<=9;i++)
					{
						System.out.println(arr[i]);
					}
					break;
				case 5:
					int max=0;
					for(i=0;i<arr.length;i++)
					{
						if(i==0)
						{
							max=arr[i];
						}
						else if(arr[i]>max)
						{
							max=arr[i];
						}
					}
					System.out.println("The maximum number is :"+max);
					break;
				case 6:
					System.out.println("exit the program");
					s.close();
					break;

				default:
					System.out.println("Invalid choice");
				}
			}
	}
	
}