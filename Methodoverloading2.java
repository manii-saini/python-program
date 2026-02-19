import javax.swing.*;
class Methodoverloading2
{
	public void add(int a,int b)
	{
		int ans=a+b;
		System.out.println("ans="+ans);
	}
	public void add(double a,double b,double c)
	{
		double ans=a+b+c;
		System.out.println("ans="+ans);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Methodoverloading2 m=new Methodoverloading2();
		m.add(4,5);
		m.add(4.5,6.7,8.6);
	}
}