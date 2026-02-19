
import javax.swing.*;

class praticse
{
    public static void main(String args[])
    {
        int base,com,ans=1;
        base=Integer.parseInt(JOptionPane.showInputDialog("Enter your base"));
        com=Integer.parseInt(JOptionPane.showInputDialog("Enter your component"));
        for(int i=1;i<=com;i++)
        {
            ans=ans*base;
        }
        System.out.println("The power is:"+ans);
    }
}