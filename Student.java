import javax.swing.*;
class Student
{
	private int rollno;
	private String name;
	private double marks;
	
	public void getdata()
	{
		rollno=Integer.parseInt(JOptionPane.showInputDialog("enter your roll no"));
		name=JOptionPane.showInputDialog("enter your name");
		marks=Double.parseDouble(JOptionPane.showInputDialog("enter your marks"));
	}
		
	public void showdata()
	{
		System.out.println("roll no:"+rollno);
		System.out.println("name:"+name);
		System.out.println("marks:"+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.getdata();
		s.showdata();
	}
}