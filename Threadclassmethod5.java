//eg of setPriority
class Threadclassmethod5
{
	public static void main(String args[])
	{	
		Thread.currentThread().setPriority(9);
		int pno=Thread.currentThread().getPriority();
		System.out.println("current thread priority is:"+pno);
	}
}