import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page3 implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField input;
    private JButton add;
    private JButton next;
    private JButton previous;


    public page3() {
        frame = new JFrame();
        panel = new JPanel();

        next = new JButton("Next");
        next.addActionListener(this);


    }

    public static void main(String[] args) {
        new page3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
