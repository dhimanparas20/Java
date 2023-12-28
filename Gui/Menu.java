package Gui;
import javax.swing.*;
public class Menu {
JMenu menu,submenu,m1,m2,m3;
JMenuItem i1,i2,i3,i4,i5,i6;
Menu() {
JFrame f = new JFrame("Menu And MenuItem Example");
JMenuBar mb = new JMenuBar();
menu = new JMenu("File");
m1=new JMenu("Edit");
m2=new JMenu("View");
m3=new JMenu("Help");
submenu = new JMenu("Print");
i1 = new JMenuItem("New");
i2 = new JMenuItem("Open");
i3 = new JMenuItem("Save");
i4 = new JMenuItem("Save as");
i5 = new JMenuItem("Print");
i6 = new JMenuItem("Page Layout");
menu.add(i1);  menu.add(i2);  menu.add(i3);  menu.add(i4);
submenu.add(i5);  submenu.add(i6);
menu.add(submenu);  mb.add(menu); mb.add(m1); mb.add(m2); mb.add(m3);
f.setJMenuBar(mb);  f.setSize(400, 400);
f.setLayout(null);      f.setVisible(true);}
public static void main(String[] args) {  
    new Menu();
   }
}     
