class A
{
	public final void display()
	{
		System.out.println("base class is called");
	}
}
class B extends A
{
	public void display()
	{
		super.display();
		System.out.println("sub class is called");
	}
}
public class Final2
{
	public static void main(String args[])
	{
		 B b=new B();
		b.display();
		
	}
}