class Person
{
	private String name;
	private int age;
	
	public Person(String s,int a)
	{
		name=s;
		age=a;
	}

	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Teacher extends Person
{
	private String post;
	
	public Teacher(String s,int a,String c)
	{
		super(s,a);
		post=c;
	}
	public void display()
	{
		super.display();
		System.out.println("post:"+post);
	}
}
class Student extends Person
{
	private int standard;
	public Student(String s,int a,int st)
	{
		super(s,a);
		standard=st;
	}
	public void display()
	{
		super.display();
		System.out.println("Standard:"+standard);
	}
}

public class Hierachicalinheritance
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher("manish",23,"TGT");
		Student s=new Student("madhu",56,10);
		t.display();
		s.display();
	}
}