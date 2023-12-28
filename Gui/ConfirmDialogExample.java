package Gui;
import javax.swing.*;

public class ConfirmDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Confirm Dialog Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Show a confirm dialog
        int result = JOptionPane.showConfirmDialog(frame,
                "Do you want to continue?",
                "Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION);

        // Process the user's choice
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "You clicked YES!");
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(frame, "You clicked NO!");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(frame, "You clicked CANCEL!");
        } else {
            JOptionPane.showMessageDialog(frame, "Dialog Closed without selection!");
        }

        frame.pack();
        frame.setVisible(true);
    }
}
