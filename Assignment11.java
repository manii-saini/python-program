class Data
{
	protected float x,y;
	
	public void getdata(float a,float  b)
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
class Maximum extends Data
{
	private float max;
	
	public void max()
	{
		if(x>y)
		{
			max=x;
		}
		else
		{
			max=y;
		}
	}
		
	public void showmax()
	{
		System.out.println("Maximum is:"+max);
	}

}
public class Assignment11
{
	public static void main(String args[])
	{
		Maximum m=new Maximum();
		m.getdata((float) 31.4, (float) 42.5);
		m.showdata();
		m.max();
		m.showmax();
	}
}
	