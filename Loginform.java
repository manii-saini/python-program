import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Loginform extends Frame implements ActionListener,WindowListener
{

	private Label l1,l2;
	private TextField t1, t2;
	private Button b1, b2,b3;

	public Loginform()
	{
		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("LOGIN FORM");
		l1 = new Label("USER NAME");
		l2 = new Label("PASSWORD");
		t1 = new TextField(20);
		t2 = new TextField(20);
		b1 = new Button("Log In");
		b2 = new Button("Reset");


		GridLayout g = new GridLayout(3,2);
		setLayout(g);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(this);
	}
	public void windowClosing(WindowEvent ee)
	{
	System.exit(1);
	}
	public void windowOpened(WindowEvent ee)
	{
	
	}
	public void windowClosed(WindowEvent ee)
	{
	
	}
	public void windowIconified(WindowEvent ee)
	{
	
	}
	public void windowDeiconified(WindowEvent ee)
	{
	
	}
	public void windowActivated(WindowEvent ee)
	{
	
	}
	public void windowDeactivated(WindowEvent ee)
	{
	
	}
		
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String uname, pass;
			uname = t1.getText().trim();
			pass = t2.getText().trim();
			
			if(uname.equals("buddy") && pass.equals("123456"))
			{
				JOptionPane.showMessageDialog(this,"Login Successfully");
				Welcome w=new Welcome();
				this.dispose();


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

