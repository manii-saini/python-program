import java.util.Scanner;
class Assignment4searching
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int i,value,loc=-1;
		System.out.println("Enter a Array numbers:");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
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
	}
}