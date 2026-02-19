import javax.swing.*;
class Percentage
{
	public static void main(String args[])
	{
		int marks;
		marks=Integer.parseInt(JOptionPane.showInputDialog("enetr your marks"));
		if(marks==33)
		{
			System.out.println("student is pass");
		}
		if(marks>33 && marks<=50)
		{
			System.out.println("The student is d grade");
		}
		if(marks>50 && marks<=70)
		{
			System.out.println("The student is c grade");
		}
		if(marks>70 && marks<=85)
		{
			System.out.println("The student is b grade");
		}
		if(marks>85 && marks<=95)
		{
			System.out.println("The student is A grade");
		}
		if(marks>=95 && marks<=100)
		{
			System.out.println("The student is A+ grade");
		}
		if(marks<33)
		{
			System.out.println("The student is fail");
		}
		else
		{
			System.out.println("wrong grade");
		}

	}
}