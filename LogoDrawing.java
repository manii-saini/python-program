
import javax.swing.*;
import java.awt.*;

public class LogoDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Enable anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Background Color
        setBackground(Color.WHITE);

        // Draw Circular Outline
        g2d.setColor(new Color(34, 139, 34));  // Green color
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(50, 50, 200, 200);

        // Draw Leaves
        g2d.setColor(new Color(0, 128, 0));
        g2d.fillOval(140, 70, 20, 40); // Center leaf
        g2d.fillOval(120, 90, 20, 30); // Left leaf
        g2d.fillOval(160, 90, 20, 30); // Right leaf

        // Draw Waves (Blue & Green)
        g2d.setColor(new Color(0, 100, 255));
        g2d.fillArc(70, 150, 160, 100, 0, -180); // Blue wave
        
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillArc(70, 140, 160, 90, 0, -180); // Green wave

        // Draw Stem
        g2d.setColor(new Color(0, 100, 0));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(150, 110, 150, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("envirnment Logo");
        LogoDrawing panel = new LogoDrawing();
       
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
