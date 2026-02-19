import javax.swing.*;
class Methodoverloading3
{
	public void add(double a,int b)
	{
		double ans=a+b;
		System.out.println("ans="+ans);
	}
	public void add(int a,double b)
	{
		double ans=a+b;
		System.out.println("ans="+ans);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Methodoverloading3 m=new Methodoverloading3();
		m.add(4.6,7);
		m.add(4,7.8);
	}
}