
public class Assignment2
{
	public static void main(String args[])
	{
	
	if(args.length!=5)
	{
			System.out.println("please provide exectly 5 integer as command like arugment:");
	
			return;
	}
	int sum=0;
		
	for(String arg:args)
	{
		sum+=Integer.parseInt(arg);
	}
		
		System.out.println("sum="+sum);
     }

}