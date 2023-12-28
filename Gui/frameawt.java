package Gui;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frameawt {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Paras: FRAME USING AWT");

        // Set the size of the frame
        frame.setSize(800, 800);
        
 // Add a WindowListener to handle window closing
 frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent we) {
        System.exit(0); // Terminate the application
    }
});
   
        // Make the frame visible
        frame.setVisible(true);
    }
}
