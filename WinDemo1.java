// eg of moving object:
import java.awt.*;
class WinDemo1 extends Frame
{
	public WinDemo1()
	{
		setSize(800,800);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		while(true)
		{
		int x=20;
		g.setColor(Color.red);
		g.fillOval(x,50,100,100);
		while(x<=690)
		{
			g.setColor(Color.red);
			g.fillOval(x,50,100,100);
			
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.white);
			g.fillOval(x,50,100,100);
			x=x+10;
		}
		int y=50;
		g.setColor(Color.red);
		g.fillOval(690,y,100,100);
		while(y<=690)
		{
			g.setColor(Color.red);
			g.fillOval(690,y,100,100);
			
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.white);
			g.fillOval(690,y,100,100);
			y=y+10;
		}
		 x=690;
		g.setColor(Color.red);
		g.fillOval(x,50,100,100);
		while(x>=20)
		{
			g.setColor(Color.red);
			g.fillOval(x,690,100,100);
			
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.white);
			g.fillOval(x,690,100,100);
			x=x-10;
		}
		y=690;
		g.setColor(Color.red);
		g.fillOval(20,y,100,100);
		while(y>=50)
		{
			g.setColor(Color.red);
			g.fillOval(20,y,100,100);
			
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.white);
			g.fillOval(20,y,100,100);
			y=y-10;
		}
	      } 
	}
}

class Demo
{
	public static void main(String args[])
	{
		WinDemo1 obj=new WinDemo1();
	}
}