package Gui;
import javax.swing.*;
import java.awt.*;
class MyDrawing extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);      g.fillRect(50, 50, 150, 75); 
        g.setColor(Color.BLACK);   g.drawString("Rectangle", 125, 140);
        g.setColor(Color.RED);         g.fillOval(250, 50, 150, 75); 
        g.setColor(Color.BLACK);    g.drawString("Oval", 325, 140);
        g.setColor(Color.GREEN);  
 int[] xPoints = {450, 525, 600};   int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);     g.setColor(Color.BLACK);
        g.drawString("Triangle", 525, 140);   g.setColor(Color.ORANGE);
        g.fillOval(650, 50, 150, 150);            
        g.setColor(Color.BLACK);
        g.drawString("Circle", 725, 140);  }}
public class javashapes {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {  JFrame frame = new JFrame("Shapes Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Create an instance of your custom component
            MyDrawing drawing = new MyDrawing();
            // Add your custom component to the frame
            frame.add(drawing);
            frame.setSize(850, 250); 
            frame.setVisible(true);         });  }}

