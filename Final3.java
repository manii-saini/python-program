final class A
{
	public void show()
	{
		System.out.println("base class is called");
	}
}
class B extends A
{
	public void display()
	{
	
		System.out.println("sub class is called");
	}
}
public class Final2
{
	public static void main(String args[])
	{
		 B b=new B();
		b.show();
		b.display();
		
	}
}