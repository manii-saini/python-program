import java.util.Scanner;
class Assignment4sorting
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int i,j;
		
		System.out.println("Enter a Array elements");
		for(i=0;i<=9;i++)
		{
			arr[i]=s.nextInt();
		}
	
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
	}
}