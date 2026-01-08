import javax.swing.*;
class constructoroverloading
{
	private int rollno;
	private String name;
	private Double marks;
	
	public constructoroverloading()
	{
		rollno=101;
		name="madhu";
		marks=78.9;
	}
	public constructoroverloading(int rn,String n,double m)
	{
		rollno=rn;
		name=n;
		marks=m;
	}
	
	public void showdata()
	{
		System.out.println("roll number is:"+rollno);
		System.out.println("name is:"+name);
		System.out.println("marks is:"+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
		constructoroverloading p=new constructoroverloading(123,"manish",56.6);
		p.showdata();
		constructoroverloading s=new constructoroverloading();
		s.showdata();
	}
}