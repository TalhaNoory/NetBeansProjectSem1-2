package containers;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        JInternalFrame internalFrame = new JInternalFrame("My succes");
        internalFrame.add(new JButton("THE END"));
        internalFrame.setPreferredSize(new Dimension(200, 100));
        
        frame.add(internalFrame);
        internalFrame.setVisible(true);
        
        

        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
