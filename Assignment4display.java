import java.util.Scanner;
class Assignment4display
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	
		int arr[]=new int[10];
		System.out.println("Enter a array numbers");
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Display Array numbers");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}		
}