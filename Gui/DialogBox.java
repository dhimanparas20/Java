package Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBox{
public static void main(String[] args) {
JFrame f= new JFrame("DialogBox Demo");
JButton b1= new JButton("File Status");
b1.setBounds(10,120,200,30);
JButton b2= new JButton("Confirm");
b2.setBounds(10,70,200,30);
JButton b3= new JButton("Delete File");
b3.setBounds(10,20,200,30);
f.add(b3);
f.add(b2);
f.add(b1);
b1.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(f,"The file has been deleted successfully!","message",JOptionPane.INFORMATION_MESSAGE);
}
});
b2.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showConfirmDialog(f,"Are you sure you wish to delete the file?");
}
});
b3.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showInputDialog(f,"Enter file to be deleted");
}
});
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


