import java.awt.*;
class WinDemo extends Frame
{
	WinDemo()
	{
		setSize(700,700);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
				g.fillOval(280,150,100,100);
		g.setColor(Color.BLACK);
				g.fillOval(280,300,100,100);
		g.setColor(Color.BLACK);
			g.fillOval(280,450,100,100);

		while(true)
		{
			g.setColor(Color.GREEN);
				g.fillOval(280,150,100,100);
		
			try
			{
				
				Thread.sleep(5000);
				
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.BLACK);
			g.fillOval(280,150,100,100);

							g.setColor(Color.YELLOW);
				g.fillOval(280,300,100,100);
			try
			{

				Thread.sleep(5000);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.BLACK);
			g.fillOval(280,300,100,100);
	
			g.setColor(Color.RED);
				g.fillOval(280,450,100,100);
			try
			{
				
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.BLACK);
			g.fillOval(280,450,100,100);
		}
	}
}

class Demo
{
	public static void main(String args[])
	{
		WinDemo w=new WinDemo();

	}
}