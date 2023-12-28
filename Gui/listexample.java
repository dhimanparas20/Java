package Gui;
import javax.swing.*;
import java.awt.event.*;
public class listexample { listexample() { JFrame f= new JFrame("List Demo");
final JLabel label = new JLabel();
label.setSize(500,50);    JLabel label1 = new JLabel("Languages");
label1.setSize(500,50);  JLabel label2 = new JLabel("Frameworks");
label2.setSize(500,50);  JButton b=new JButton("Show");  b.setBounds(200,230,80,30);
final DefaultListModel<String> l1 = new DefaultListModel<>();
l1.addElement("C");       l1.addElement("C++");          l1.addElement("Java");
l1.addElement("PHP");  l1.addElement("Python");      l1.addElement("HTML");
final JList<String> list1 = new JList<>(l1);
label1.setBounds(10,150,500,50);   list1.setBounds(100,120, 75,110);
DefaultListModel<String> l2 = new DefaultListModel<>();
l2.addElement("Turbo C++");  l2.addElement("VSCode"); l2.addElement("Spring");
l2.addElement("YII"); l2.addElement("Eclipse"); l2.addElement("IntelIJ");
final JList<String> list2 = new JList<>(l2);
label2.setBounds(10,250,500,50); list2.setBounds(100,240, 75,110);
f.add(list1);f.add(list2);f.add(b);f.add(label);f.add(label1);f.add(label2);
f.setSize(450,450);  f.setLayout(null); f.setVisible(true);
b.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
String data = ""; if (list1.getSelectedIndex() != -1) {
data = "Programming language Selected: " + list1.getSelectedValue();
label.setText(data); }  data += ", FrameWork Selected: ";
for(Object frame :list2.getSelectedValuesList()){ if(list2.getSelectedIndex() != -1){
data += frame + " "; }} label.setText(data); }});}
public static void main(String[] args) { new listexample(); }}

