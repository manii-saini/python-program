import javax.swing.*;
class Methodoverloading1
{
	public void add(int a,int b)
	{
		int ans=a+b;
		System.out.println("ans="+ans);
	}
	public void add(int a,int b,int c)
	{
		int ans=a+b+c;
		System.out.println("ans="+ans);
	}
}
class Demo
{
	public static void main(String args[])
	{
			Methodoverloading1 m=new Methodoverloading1();
		int a,b,c;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a second number"));
		c=Integer.parseInt(JOptionPane.showInputDialog("enter a thrid number"));
		m.add(a,b);
		m.add(a,b,c);
	}
}