import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class Deletestudent extends Frame implements ActionListener,WindowListener
{
	private Label l1,l2,l3;
	private TextField t1,t2,t3;
	private Button b1,b2,b3;
	private Panel p1,p2,p3;
	
	public Deletestudent()
	{
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Delete student datils");
		l1=new Label("Rollno");
		l2=new Label("name");
		l3=new Label("marks");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b1=new Button("Delete");
		b2=new Button("resat");
		b3=new Button("Back");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		FlowLayout f=new FlowLayout();
		p1.setLayout(f);
		p1.add(l1);
		p1.add(t1);
		GridLayout g=new GridLayout(2,2);
		p2.setLayout(g);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		FlowLayout f1=new FlowLayout();
		p3.setLayout(f1);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		GridLayout g1=new GridLayout(3,1);
		setLayout(g1);
		add(p1);
		add(p2);
		add(p3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
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
			String rno;
			rno=t1.getText().trim();
			String query="delete from student where rollno='"+rno+"'";
			long ans=stmt.executeUpdate(query);		
			if(ans==0)
			{
				JOptionPane.showMessageDialog(null,"Not deleted.....");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"successfully deleted.....");
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		JOptionPane.showMessageDialog(this ,"Delete is sucessfully");
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		}
		else if(e.getSource()==b3)
		{
			this.dispose();
			Welcome w=new Welcome();
		}
	}	

}