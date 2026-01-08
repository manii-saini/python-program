import javax.swing.*;
class Defaultconstructor
{
	private int rollno;
	private String name;
	private Double marks;
	
	public Defaultconstructor()
	{
		rollno=101;
		name="manish";
		marks=34.6;
	}
	
	public void showdata()
	{
		System.out.println("roll number:"+rollno);
		System.out.println("name is:"+name);
		System.out.println("marks:"+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
		 Defaultconstructor d=new Defaultconstructor();
			d.showdata();
	}
}