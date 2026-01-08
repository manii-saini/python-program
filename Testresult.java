//ex of multilevel inheritance and method overriding
class Student
{
	private int rollno;
	private String name;
	
	public void getdata(int r,String s)
	{
		rollno=r;
		name=s;
	}
		
	public void showdata()
	{
		System.out.println("roll no:"+rollno);
		System.out.println("name:"+name);
	}
}
class Marks extends Student
{
	protected int marks1,marks2;
	
	public void getmarks(int m1,int m2)
	{
		marks1=m1;
		marks2=m2;
	}
		
	public void showdata()
	{
		super.showdata();
		System.out.println("frist subject marks:"+marks1);
		System.out.println("second subject marks:"+marks2);
	}
}
class Result extends Marks
{
	private int total;
	public void showdata()
	{
		super.showdata();
		total=marks1+marks2;
		System.out.println("total marks:"+total);
	}
}
public class Testresult
{
	public static void main(String args[])
	{
		Result s=new Result();
		s.getdata(123,"manish");
		s.getmarks(67,97);
		s.showdata();
	}
}