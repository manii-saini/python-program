class Student
{
	private String name;
	private int rollno;
	
	public void getdata(String s,int r)
	{
		name=s;
		rollno=r;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
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
	
	public void display()
	{
		super.display();
		System.out.println("marks1:"+marks1);
		System.out.println("marks2:"+marks2);
	}
}

class Totalmarks extends Marks
{
	private int total;
	
	public void display()
	{
		super.display();
		total=marks1+marks2;
		System.out.println("Total marks is:"+total);
	}
}

 public class Assignment12
{
	public static void main(String[] args)
	{
		Totalmarks t=new Totalmarks();
		t.getdata("manish",123);
		t.getmarks(80,56);
		t.display();
	}
}