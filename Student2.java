import java.lang.*;
public class Student2
{
	private int rollno;
	private String name;
	
	public void getdata(int rn,String n,double m)
	{
		rollno=rn;
		name=n;
	}
	public int getrollno()
	{
		return rollno;
	}
	public String getname()
	{
		return name;
	}
	public void showdata()
	{
		System.out.println("roll number is:"+rollno);
		System.out.println("name is:"+name);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Student2 s=new Student2();
		//System.out.println("roll="+s.getrollno());
		//System.out.println("name="+s.getname());
		s.getdata(123,"manish",56.6);
		s.showdata();
	}
}