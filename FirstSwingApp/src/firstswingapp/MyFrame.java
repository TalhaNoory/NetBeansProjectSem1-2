package firstswingapp;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Dhono
 */
public class MyFrame extends JFrame {
    
    public MyFrame(){
        
        initComponents();
        
    }

    private void initComponents() {

        this.setLayout(new FlowLayout());

        JButton button = new JButton("Button");
        this.add(button);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
