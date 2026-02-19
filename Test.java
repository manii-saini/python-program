//single inheriatance
class data
{
	protected int x,y;

	public void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	
	public void showdata()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}

class greater extends data
{
	
	public void maximum()
	{
		if(x>y)
		{
			System.out.println("x is maximum:"+x);
		}
		else
		{
			System.out.println("y is maximum:"+y);
		}
	}
	
}

class Test
{
	public static void main(String args[])
	{
		greater g=new greater();
		g.getdata(5,6);
		g.showdata();
		g.maximum();
	}
}