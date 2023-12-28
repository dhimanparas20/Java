package Gui;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
import javax.swing.*;

public class MyFrame{
    MyFrame() {
        JFrame f = new JFrame("Label and button");

        JButton b = new JButton("Submit");
        b.setBounds(100, 200, 100, 30);

        JButton b2 = new JButton("Close");
        b2.setBounds(200, 200, 80, 30);

        JLabel l = new JLabel("Enter name:");
        l.setBounds(20, 20, 100, 20);

        JTextField t = new JTextField();
        t.setBounds(120, 20, 150, 20);

        JLabel l2 = new JLabel("Enter age:");
        l2.setBounds(20, 50, 100, 20);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 50, 150, 20);

        JLabel l1 = new JLabel("--");
        l1.setBounds(20, 100, 200, 20);
        JLabel l3 = new JLabel("-");
        l3.setBounds(20, 120, 200, 20);


        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(t);
        f.add(t2);
        f.add(b);
        f.add(b2);
        f.add(l1);

        f.setSize(400, 300);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the window on exit

        b.addActionListener(e -> {
            String name = t.getText();
            String age = t2.getText();
            l1.setText("Hello your name is:" + name);
            l3.setText("Your age is:" + age);

        });
        b2.addActionListener(e -> {
        f.dispose();
        });
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
