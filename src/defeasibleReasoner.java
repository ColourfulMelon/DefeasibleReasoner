import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class defeasibleReasoner implements ActionListener {
    private JFrame frame;
    private  JPanel panel;
    private JPanel right;
    private JButton next;
    private JButton add = new JButton("Add");
    private JTextField input = new JTextField();
    private JLabel title = new JLabel("Defeasible Reasoner");
    private JLabel enter_noun = new JLabel("Enter a Noun");
    private JLabel nouns = new JLabel("Nouns:");
    private  JList list;
  //  private DefaultListModel listModel;
    private JScrollPane scroll = new JScrollPane();
    private List<String> objectList = new ArrayList<>(0);

    public defeasibleReasoner() {
        next = new JButton("Next");
        next.addActionListener(this);
        next.setVerticalAlignment(JButton.BOTTOM);
        next.setHorizontalAlignment(JButton.RIGHT);
        next.setFocusable(false);
        add.addActionListener(this);
        add.setFocusable(false);

        input.setSize(400,30);

       // listModel = new DefaultListModel();
        //list = new JList(listModel);
        list = new JList<String>(objectList.toArray(new String[objectList.size()]));
        list.setVisibleRowCount(-1);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //list.setPreferredSize(new Dimension(300,500));
        //list.setPreferredSize(new Dimension(300,500));
        list.setBackground(Color.ORANGE);
        scroll.setViewportView(list);
        scroll.getViewport().setOpaque(false);
        list.setLayoutOrientation(JList.VERTICAL);


        panel = new JPanel();
        //panel.setBorder(BorderFactory.createEmptyBorder(30,30,600,800));
        panel.setLayout(null);
        panel.setBounds(0,0,500,1000);
        panel.add(title);
        panel.add(enter_noun);
        panel.add(input);
        panel.add(add);
        panel.add(next);
        panel.setBackground(Color.blue);

        right = new JPanel();
        //right.setBorder(BorderFactory.createEmptyBorder(30,30,600,200));
        right.setLayout(null);
        right.add(nouns);
        right.add(scroll);
        right.setBackground(Color.GREEN);
        //panel.add(right, BorderLayout.EAST);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.add(right, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Defeasible Solver");
        frame.setSize(1000,800);
        //frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new defeasibleReasoner();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            System.out.println("Next button pressed");
        }
        else if (e.getSource() == add){
            System.out.println("Add button pressed");
           // listModel.addElement(input.getText());
            objectList.add(input.getText());

        }

    }
}

