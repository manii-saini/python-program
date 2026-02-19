
//Java Code for Ecomark Logo

import javax.swing.*;
import java.awt.*;

public class EcomarkLogo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Enable Anti-Aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background Color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw the Earthen Pot (Base Shape)
        g2d.setColor(new Color(139, 69, 19)); // Brown color for pot
        g2d.fillOval(100, 150, 200, 150); // Bottom part of the pot
        g2d.fillRect(140, 100, 120, 50);  // Top part (neck of pot)

        // Draw Green Leaf inside the Pot
        g2d.setColor(Color.GREEN);
        int[] xPoints = {200, 180, 220};
        int[] yPoints = {130, 200, 200};
        g2d.fillPolygon(xPoints, yPoints, 3); // Leaf triangular shape

        g2d.fillOval(180, 180, 40, 60); // Bottom part of the leaf

        // Outline for Pot
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(100, 150, 200, 150);
        g2d.drawRect(140, 100, 120, 50);
        
        // Outline for Leaf
        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.drawOval(180, 180, 40, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ecomark Logo");
        EcomarkLogo panel = new EcomarkLogo();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
