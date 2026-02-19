import javax.swing.*;
class Student
{
	private int rollno;
	private String name;
	
	public void getdata()
	{
		rollno=Integer.parseInt(JOptionPane.showInputDialog("enter your rollno"));
		name=JOptionPane.showInputDialog("enter your name");
	}
	
	public void showdata()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
	}
}
class Marks extends Student
{
	private int physicsmarks;
	private int chemistrymarks;	
	private int mathmarks;
	private int totalmarks;
	private int percentage;
	
	public void getmarks()
	{
		 physicsmarks=Integer.parseInt(JOptionPane.showInputDialog("enter a physics marks"));
		chemistrymarks=Integer.parseInt(JOptionPane.showInputDialog("enter a chemistry marks"));
		 mathmarks=Integer.parseInt(JOptionPane.showInputDialog("enter a math marks"));
	}
	
	public void calculateresult()
	{
			totalmarks=(physicsmarks+chemistrymarks+mathmarks);
		percentage=totalmarks/3;
	}
	
	public void showmarks()
	{
			System.out.println("physics marks:"+physicsmarks);
			System.out.println("chemistry marks:"+chemistrymarks);
			System.out.println("math marks:"+mathmarks);
			System.out.println("total marks:"+totalmarks);
			System.out.println("percentage:"+percentage);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Marks m=new Marks();
		m.getdata();
		m.showdata();
		m.getmarks();
		m.calculateresult();
		m.showmarks();
	}
}