import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class Newstudent extends Frame implements ActionListener,WindowListener
{
	private Label l1,l2,l3;
	private TextField t1,t2,t3;
	private Button b1,b2;
	
	public Newstudent()
	{
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("new student datils");
		l1=new Label("Rollno");
		l2=new Label("name");
		l3=new Label("marks");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("save");
		b2=new Button("resat");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		GridLayout g=new GridLayout(4,2);
		setLayout(g);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
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
		try
		{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection conn=DriverManager.getConnection("jdbc:odbc:schooldsn");
			Statement stmt=conn.createStatement();
			String rno,nm,m;
			rno=t1.getText().trim();
			nm=t2.getText().trim();
			m=t3.getText().trim();
			String query="insert into student (rollno,name,marks) values('"+rno+"','"+nm+"','"+m+"')";
			long ans=stmt.executeUpdate(query);		
			if(ans==0)
			{
				JOptionPane.showMessageDialog(null,"Not inserted.....");
			}
			else
			{
					JOptionPane.showMessageDialog(null,"successfully inserted.....");
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
			this.dispose();
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		}
	}	

}
