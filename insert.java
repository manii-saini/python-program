
import java.sql.*;
import javax.swing.*;
class Insert
{
	public static void main(String args[]) 
	{
		try
		{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection conn=DriverManager.getConnection("jdbc:odbc:schooldsn");
		Statement stmt=conn.createStatement();
		String rollno,name,marks;
		rollno=JOptionPane.showInputDialog("enter rollno");
		name=JOptionPane.showInputDialog("enter name");	
		marks=JOptionPane.showInputDialog("enter marks");
		String query="insert into student (rollno,name,marks) values('"+rollno+"','"+name+"','"+marks+"')";
		int ans=stmt.executeUpdate(query);
		if(ans>0)
		{
			JOptionPane.showMessageDialog(null,"successfully inserted...");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"successfully not inserted...");
		}
		}
		catch(Exception e)
		{
			System.out.println("error is "+e);
		}	
	}
}