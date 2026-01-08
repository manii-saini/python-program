
import javax.swing.*;
import java.awt.*;

public class EnvironmentLogo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Enable Anti-Aliasing for smoother graphics
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background Color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw Green Earth
        g2d.setColor(new Color(34, 139, 34)); // Forest Green
        g2d.fillOval(100, 100, 200, 200); // Earth circle

        // Draw Earth Outline
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(100, 100, 200, 200);

        // Draw Two Leaves (Left and Right)
        g2d.setColor(Color.GREEN);
        g2d.fillOval(70, 170, 60, 100);  // Left leaf
        g2d.fillOval(270, 170, 60, 100); // Right leaf

        // Outline for Leaves
        g2d.setColor(Color.BLACK);
        g2d.drawOval(70, 170, 60, 100);
        g2d.drawOval(270, 170, 60, 100);

        // Draw Leaf Veins (Curved Lines)
        g2d.setStroke(new BasicStroke(2));
        g2d.drawArc(80, 180, 40, 80, 30, 120);
        g2d.drawArc(280, 180, 40, 80, 30, 120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Environment Logo");
        EnvironmentLogo panel = new EnvironmentLogo();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
