import javax.swing.*;
import java.sql.*;
class in
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection conn=DriverManager.getConnection("jdbc:odbc:schooldsn");
			Statement stmt=conn.createStatement();
			String rollno,name,marks;
			rollno=JOptionPane.showInputDialog("enter your roll number");
			name=JOptionPane.showInputDialog("enter your name");
			marks=JOptionPane.showInputDiaog("enter your marks");
			String query="insert into student(rollno,name,marks)values("'+rollno+'",'"+name+'",'"+marks+'")";
			int ans=stmt.executeUpdate(query);
			if(ans>0)
			{
				JOptionPane.showMessageDialog(null,"sucessfully inserted...");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"sucessfully not inseted..");
			}
		}
		catch(Exception e)
		{
		System.out.println("error is "+e);
		}
	}	
}