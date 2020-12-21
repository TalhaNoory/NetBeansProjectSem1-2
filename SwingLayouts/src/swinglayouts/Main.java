package swinglayouts;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.SpringLayout;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);
        
        JButton button1 = new JButton("Button1");
        
        layout.putConstraint(SpringLayout.WEST, button1, 0, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.EAST, button1, 500, SpringLayout.EAST, frame);
        layout.putConstraint(SpringLayout.SOUTH, button1, 500, SpringLayout.SOUTH, frame);
        layout.putConstraint(SpringLayout.NORTH, button1, 0, SpringLayout.NORTH, frame);
            
        
        frame.add(button1);

        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
