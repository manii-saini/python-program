import java.util.Scanner;
class Assignment4maximum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int i,max=0;
		
		System.out.println("Enter a Array elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
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
	}
}