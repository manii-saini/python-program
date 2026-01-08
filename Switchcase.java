import javax.swing.*;
class Switchcase
{
	public static void main(String args[])
	{
		int choice;
		System.out.println("#### welcome to switchcase program $$$$");
		System.out.println("****enter 1 frist to addition****");
		System.out.println("****enter 2 second to substruction****");
		System.out.println("****enter 3 three to multiplication****");
		System.out.println("****enter 4 four to division****");
		System.out.println("****enter 5 five to modulas****");
		System.out.println("**** enter 6 to next switch case");
				System.out.println("next switch case***************");
				System.out.println("enter 1 to good morning");
				System.out.println("enter 2 to good after noon");
				System.out.println("enter 3 to good noght");
		int a,b;
		choice=Integer.parseInt(JOptionPane.showInputDialog("enetr your choice"));
		switch(choice)
		{
			case 1:
			System.out.println("@@ welcome to addition @@");
			a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
			System.out.println("the value of a is:"+a);
			b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
			System.out.println("the value of a is:"+b);
			int sum=0;
			sum=a+b;
			System.out.println("The addition of a and b is :"+sum);
			break;
			
			case 2:
			System.out.println("@@ welcome to substruction @@");
			int sub=0;
			a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
			System.out.println("the value of a is:"+a);
			b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
			System.out.println("the value of a is:"+b);
		
			sub=a-b;
			System.out.println("The substruction of a and b is :"+sub);
			break;
			
			case 3:
			System.out.println("@@ welcome to multiplication @@");
			int mul=0;
			a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
			System.out.println("the value of a is:"+a);
			b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
			System.out.println("the value of a is:"+b);
		
			mul=a*b;
			System.out.println("The multiplication of a and b is :"+mul);
			break;

			case 4:
			System.out.println("@@ welcome to division @@");
			int div=0;
			a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
			System.out.println("the value of a is:"+a);
			b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
			System.out.println("the value of a is:"+b);
		
			div=a/b;
			System.out.println("The division of a and b is :"+div);
			break;

			case 5:
			System.out.println("@@ welcome to modulas @@");
			int mod=0;
			a=Integer.parseInt(JOptionPane.showInputDialog("enter frist number"));
			System.out.println("the value of a is:"+a);
			b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
			System.out.println("the value of a is:"+b);
		
			mod=a%b;
			System.out.println("The modulas of a and b is :"+mod);
			break;
			
				case 6:
						System.out.println("enter 1 to good morning");
						System.out.println("enter 2 to good after noon");
						System.out.println("enter 3 to good noght");
						
						choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
						switch(choice)
						{
							case 1:
								System.out.println("welcome to good morning");
								break;
							case 2:
								System.out.println("welcome to good after noon");
								break;
							case 3:
								System.out.println("welcome to good night");
								break;
							default:
								System.out.println("invalid choice");
						}
			break;	
			
				default:
					System.out.println("invalid choice");
		}
		
	}
}