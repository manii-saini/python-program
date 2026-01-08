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
			MyThread m1=new MyThread("child 1");
			MyThread m2=new MyThread("child 2");
			MyThread m3=new MyThread("child 3");
		
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