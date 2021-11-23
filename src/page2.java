import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page2 implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton add;
    private JButton next;
    private JButton previous;

    public page2(){
        frame = new JFrame();
        panel = new JPanel();

        next = new JButton("Next");
        next.addActionListener(this);
    }


    public static void main(String[] args) {
        new page2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
