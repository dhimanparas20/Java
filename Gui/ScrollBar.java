package Gui;
import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
public class ScrollBar{
    public static void main(String[] args)
 {
        JFrame f= new JFrame("Scroll bar demo");
        JScrollBar sb= new JScrollBar();
        JLabel l = new JLabel();
        l.setBounds(100,30,100,20);

        sb.setBounds(50,30,30,220);
        sb.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Item No. "+ sb.getValue());  } 
  });
        f.add(l);
        f.add(sb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 } }

