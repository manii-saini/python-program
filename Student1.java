import javax.swing.*;
class Student1
{
	private int rollno;
	private String name;
	private Double marks;
	
	public void getdata(int rn,String n,double m)
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
		Student1 s=new Student1();
		s.getdata(123,"manish",56.6);
		s.showdata();
	}
}