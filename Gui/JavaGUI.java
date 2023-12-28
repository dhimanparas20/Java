package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaGUI{
    public static void main(String[] arg){
        JFrame frame = new JFrame("Java GUI");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        panel.setLayout(new GridLayout(8,1));
        JLabel l1 = new JLabel("Enter value 1");
        JLabel l2 = new JLabel("Enter value 2");
        JLabel l3 = new JLabel();
        JTextField ta1  = new JTextField();
        JTextField ta2  = new JTextField();
        JButton b1  = new JButton("show");
        JButton b2  = new JButton("Exit");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1=ta1.getText();
                String s2=ta2.getText();
                l3.setText(s1+s2);
                JOptionPane.showMessageDialog(frame , s2);
            }
        });
        b2.addActionListener(e -> {
            frame.dispose();
        });
        panel.add(l1);
        panel.add(ta1);
        panel.add(l2);
        panel.add(ta2);
        panel.add(b1);
        panel.add(b2);
        panel.add(l3);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}