import javax.swing.*;
class Studentresult
{
	private int rollno;
	private String name;
	private int physicsmarks;
	private int chemistrymarks;
	private int mathmarks;
	private int total;
	private int percentage;
	
	public void getdata()
	{
		rollno=Integer.parseInt(JOptionPane.showInputDialog("enter your rollno"));
		name=JOptionPane.showInputDialog("enter your name");
		physicsmarks=Integer.parseInt(JOptionPane.showInputDialog("enter your physics marks"));
		chemistrymarks=Integer.parseInt(JOptionPane.showInputDialog("enter your chemistry marks"));
		mathmarks=Integer.parseInt(JOptionPane.showInputDialog("enter your math marks"));
	}
	
	public void calculateresult()
	{
		total=physicsmarks+chemistrymarks+mathmarks;
		percentage=total/3;
	}
	
	public void showdata()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("physics marks:"+physicsmarks);
		System.out.println("chemistry marks:"+chemistrymarks);
		System.out.println("math marks:"+mathmarks);
		System.out.println("total marks:"+total);
		System.out.println("percentage:"+percentage);

	}
}

class Demo
{
	public static void main(String args[])
	{
		Studentresult s=new Studentresult();
		s.getdata();
		s.calculateresult();
		s.showdata();
	}
}