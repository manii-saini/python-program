import javax.swing.*;
class A
{
	public void show()
	{
		System.out.println("Display is called");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("showdata is called");
	}
}

class Demo
{
	public static void main(String args[])
	{
		B a=new B();
		a.show();
	}
}