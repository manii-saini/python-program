import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo1 extends Frame implements ActionListener
{
	private Label l1,l2;
	private TextField t1, t2;
	private Button b1, b2,b3;
	private Panel p1,p2;

	public Demo1()
	{
		setSize(500,500);
		setTitle("LOGIN FORM");
		l1 = new Label("USER NAME");
		l2 = new Label("PASSWORD");
		t1 = new TextField(10);
		t2 = new TextField(10);
		b1 = new Button("Log In");
		b2 = new Button("Reset");
		b3 = new Button("Exit");

		p1=new Panel();
		p2=new Panel();

		GridLayout g = new GridLayout(2,2);
		p1.setLayout(g);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
	
		FlowLayout f=new FlowLayout();
		
		p2.setLayout(f);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);

		GridLayout g1 = new GridLayout(2,1);
			setLayout(g1);
				add(p1);
				add(p2);
			setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String uname, pass;
			uname = t1.getText().trim();
			pass = t2.getText().trim();
			
			if(uname.equals("admin") && pass.equals("123456"))
			{
				JOptionPane.showMessageDialog(this,"Login Successfully");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Invalid Login");	
			}
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t1.requestFocus();
		}
	}
}   

class Demo
{
	public static void main(String args[])
	{
		Demo1 obj = new Demo1();
	}
}