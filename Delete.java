
import javax.swing.*;
import java.sql.*;
class Delete
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection conn=DriverManager.getConnection("jdbc:odbc:schooldsn");
			Statement stmt=conn.createStatement();
			String rno;
			rno=JOptionPane.showInputDialog("enter rollno to delete");
			
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
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}