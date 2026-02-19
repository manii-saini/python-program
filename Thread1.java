//eg creating thread using runnable intergace
class MyThread implements Runnable
{
	private String name;
	private Thread t;
		
	public MyThread(String name)
	{
		this.name=name;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
			}
		}
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		MyThread m=new MyThread("child");
		int i;
		for(i=1;i<=5;i++)
		{
		
			try
			{
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
		}
	
	}
}