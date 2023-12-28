package Gui;
import java.awt.*;
import java.awt.event.*;
public class checkBoxGrps extends Frame implements ItemListener {
    CheckboxGroup checkboxGroup;
    Label selectedLabel;
    public checkBoxGrps() {
        checkboxGroup = new CheckboxGroup();
        selectedLabel = new Label("Selected branch: None");
        Checkbox checkbox1 = new Checkbox("CSE", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("EE", checkboxGroup, false);
        Checkbox checkbox3 = new Checkbox("ECE", checkboxGroup, false);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);
        setLayout(new FlowLayout());
        add(checkbox1);    add(checkbox2);
        add(checkbox3);    add(selectedLabel);
        setTitle("Checkbox Group Demo");   setSize(300, 200);  setVisible(true);
        // Handling window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {  System.exit(0);     } });  }

    public void itemStateChanged(ItemEvent e) {
        Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
        selectedLabel.setText("Selected option: " + selectedCheckbox.getLabel());  }
 public static void main(String[] args) {    new checkBoxGrps();    }}

