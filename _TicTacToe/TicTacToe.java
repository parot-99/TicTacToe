import java.awt.EventQueue;

public class TicTacToe {

    public static void main(String[] args) {

        EventQueue.invokeLater(()-> {

            Controller controller = new Controller();

            controller.launch();

        });
    }
}
