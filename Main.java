package _TicTacToe;

import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(()-> {


            Controller controller = new Controller();

            controller.launch();

        });
    }
}
