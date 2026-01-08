import javax.swing.*;
class Parametrizedconstructor
{
	private int rollno;
	private String name;
	private Double marks;
	
	public Parametrizedconstructor(int rn,String n,double m)
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
		Parametrizedconstructor p=new Parametrizedconstructor(123,"manish",56.6);
		p.showdata();
	}
}