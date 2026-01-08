class Person
{
	protected int x,y;
	
	public void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	
	public void showdata()
	{
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
class Maximum extends Person
{
	public void max()
	{
		if(x>y)
		{
			System.out.println("X is maximum:"+x);
		}
		else
		{
			System.out.println("y is maximum:"+y);
		}
	}
}

public class Singleinheritance
{
	public static void main(String[] args)
	{
		Maximum m=new Maximum();
		m.getdata(5,6);
		m.showdata();
		m.max();
	}
}