package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));

        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Click Me!");
        //button.setBounds(50, 50, 100, 100);
        JCheckBox checkBox = new JCheckBox("Check Me");
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        String[] comboBoxOptions = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboBoxOptions);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        JList<String> list = new JList<>(listModel);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);
        panel.add(scrollPane);
        panel.add(comboBox);
        panel.add(new JScrollPane(list));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String text2 = textArea.getText();
                //int intValue1 = Integer.parseInt(text);
                //int intValue2 = Integer.parseInt(text2);
    
                JOptionPane.showMessageDialog(frame, "Text entered: " + text + text2);
                //JOptionPane.showInputDialog("enter your choice");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
