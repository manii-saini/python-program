//eg of getPriority
class Threadclassmethod4
{
	public static void main(String args[])
	{
	
		int pno=Thread.currentThread().getPriority();
		System.out.println("current thread priority is:"+pno);
	}
}