import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DrawingView extends JFrame {

    private ArrayList<JPanel> panels = new ArrayList<>();
    private ArrayList<JLabel> labels = new ArrayList<>();


    public void RunDrawing() {

        setTitle("Tic Tac Toe");

        setLayout(new GridLayout(3,3));

        initPanels();
        initLabels();

        for(int i=0;i<9;i++) {

            panels.get(i).add(labels.get(i));
        }

        for(JPanel panel : panels) {

            add(panel);

        }


        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(800,250);
        setVisible(true);

    }

    private void initPanels() {

         JPanel panel1;
         JPanel panel2;
         JPanel panel3;
         JPanel panel4;
         JPanel panel5;
         JPanel panel6;
         JPanel panel7;
         JPanel panel8;
         JPanel panel9;

         panel1 = new JPanel();
         panel2 = new JPanel();
         panel3 = new JPanel();
         panel4 = new JPanel();
         panel5 = new JPanel();
         panel6 = new JPanel();
         panel7 = new JPanel();
         panel8 = new JPanel();
         panel9 = new JPanel();

        panels.add(panel1);
        panels.add(panel2);
        panels.add(panel3);
        panels.add(panel4);
        panels.add(panel5);
        panels.add(panel6);
        panels.add(panel7);
        panels.add(panel8);
        panels.add(panel9);


        for(JPanel panel : panels) {

            panel.setLayout(new BorderLayout());

        }



        for(JPanel panel : panels) {

            panel.setBackground(Color.WHITE);

        }



        for(JPanel panel : panels) {

            panel.setSize(200,200);

        }


    }

    private void initLabels() {

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();

        labels.add(label1);
        labels.add(label2);
        labels.add(label3);
        labels.add(label4);
        labels.add(label5);
        labels.add(label6);
        labels.add(label7);
        labels.add(label8);
        labels.add(label9);

        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        for(JLabel label:labels) {

            label.setBorder(border);
        }

    }



    public void resetView() {

        for(JLabel label:labels) {

            label.setText("");

        }
    }

    public void drawX(int index) {

       labels.get(index).setText(" x");
       labels.get(index).setFont(new Font(Font.SERIF, Font.PLAIN,200));
       labels.get(index).setForeground(Color.BLUE);

    }

    public void drawY(int index) {

        labels.get(index).setText(" o");
        labels.get(index).setFont(new Font(Font.SERIF, Font.PLAIN,200));
        labels.get(index).setForeground(Color.GREEN);

    }

    public ArrayList<JLabel> getLabels() {

        return labels;

    }

}
