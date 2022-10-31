import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI implements ActionListener {

    private int count = 0;
    private static JFrame frame;
    private static JLabel label;

    public GUI(JFrame frame, JLabel label){
        GUI.frame = frame;
        GUI.label = label;

        frame = new JFrame();
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 1");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }

public static void main (String[]args){
    new GUI(frame, label);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks:" + count);

    }
}