//eg of menubar
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Welcome extends Frame implements ActionListener,WindowListener
{
	private MenuBar mb;
	private Menu student,logout;
	private MenuItem mnew,mupdate,msearch,mdelete,mlogout;

	public Welcome()
	{
		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("menu bar");
		mb=new MenuBar();
		student=new Menu("student");
		logout=new Menu("logout");
		mnew=new MenuItem("new student details");
		mupdate=new MenuItem("update  student details");
		msearch=new MenuItem("search student details");
		mdelete=new MenuItem("delete student details");
		mlogout=new MenuItem("logout");
		student.add(mnew);
		student.add(mupdate);
		student.add(msearch);
		student.add(mdelete);
		logout.add(mlogout);
		mb.add(student);
		mb.add(logout);
		setMenuBar(mb);
		mnew.addActionListener(this);
		mupdate.addActionListener(this);	
		msearch.addActionListener(this);
		mdelete.addActionListener(this);
		mlogout.addActionListener(this);
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
		if(e.getSource()==mnew)
		{
			Newstudent n=new Newstudent();
			this.dispose();
		}
		else if(e.getSource()==mupdate)
		{
			Updatestudent u=new Updatestudent();
			this.dispose();

		}
		else if(e.getSource()==msearch)
		{
			Searchstudent s=new Searchstudent();
			this.dispose();

		}
		else if(e.getSource()==mdelete)
		{
			Deletestudent d=new Deletestudent();
			this.dispose();

		}
		else if(e.getSource()==mlogout)
		{
		this.dispose();	
		}
	}
		
}