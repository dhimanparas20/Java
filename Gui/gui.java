package Gui;
//import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class gui{
    public static void main(String[] args) {

        Frame frame = new Frame("AWT Frame Example");
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        frame.setSize(800, 900);
        frame.setVisible(true);
    }
}