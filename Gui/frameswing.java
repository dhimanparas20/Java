package Gui;
import javax.swing.JFrame;

public class frameswing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Paras: FRAME USING SWING");

        // Set the size of the frame
        frame.setSize(700, 700);

        // Make the frame visible
        frame.setVisible(true);

        // Set default close operation to exit when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
