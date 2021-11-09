import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class defeasibleReasoner implements ActionListener {
    private JFrame frame;
    private JLabel title;
    private  JPanel panel;
    private JButton next;

    public defeasibleReasoner() {
        frame = new JFrame();
        panel = new JPanel();

        next = new JButton("Next");
        next.addActionListener(this);

        title = new JLabel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,600,1200));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(next);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Defeasible Solver");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new defeasibleReasoner();
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        }
    }
}

