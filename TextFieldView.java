package _TicTacToe;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextFieldView extends JFrame {

    private JTextField textField1;
    private JTextField textField2;

    private JButton checkButton;
    private JButton startButton;
    private JButton restartButton;
    private JButton exitButton;

    private JLabel label1;
    private JLabel label2;


   public void RunGame() {

        //Main frame
        setTitle("Game launcher");

        setLayout(new GridLayout(4,2));

        Border border = BorderFactory.createLineBorder(Color.BLACK,1);

        startButton = new JButton("Start game");
        checkButton = new JButton("check");
        restartButton = new JButton(new ImageIcon(((new ImageIcon("./res.jpg")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        exitButton = new JButton("Exit");

        startButton.setBackground(Color.LIGHT_GRAY);
        restartButton.setBackground(Color.white);

        add(startButton);
        add(restartButton);

        textField1 = new JTextField();
        textField2 = new JTextField();

        textField1.setFont(new Font(Font.SERIF, Font.PLAIN,50));
        textField2.setFont(new Font(Font.SERIF, Font.PLAIN,50));

        label1 = new JLabel("Row: ");
        label2 = new JLabel("Column: ");

        label1.setFont(new Font(Font.SERIF, Font.PLAIN,50));
        label2.setFont(new Font(Font.SERIF, Font.PLAIN,50));

        label1.setBorder(border);
        label2.setBorder(border);

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);

        exitButton.setBackground(Color.red.brighter().brighter());
        checkButton.setBackground(Color.lightGray);

        add(checkButton);
        add(exitButton);

       setSize(500, 500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setLocation(300,250);
       setVisible(true);

   }

   public void clearTextField() {

       this.textField1.setText("");
       this.textField2.setText("");

   }

    public void showMessage(TextFieldView view , String string) {

        JOptionPane.showMessageDialog(view,string);

    }

    public JButton getCheckButton() {

        return checkButton;

    }

    public JButton getStartButton() {

        return startButton;

   }

    public JButton getRestartButton() {

        return restartButton;

    }

    public JButton getExitButton() {

        return exitButton;

    }

    public JTextField getTextField1() {

        return textField1;

    }

    public JTextField getTextField2() {

        return textField2;

    }

}
