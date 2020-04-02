import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller  {

    private TextFieldView view = new TextFieldView();
    private GameModel model = new GameModel();
    private DrawingView Dview = new DrawingView();



    public void launch() {

       runGame();
       startButtonPressed();
       exitButtonPressed();
       checkPressed();
       restartButtonPressed();

    }

    private void runGame() {

         view.RunGame();

    }


    private void checkPressed() {

         view.getCheckButton().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

                model.checkValidInput(view,Dview);


                 if((model.getClick()%2)!=0) {

                     model.drawX(Dview,view);

                 }

                 if((model.getClick()%2)==0) {

                     model.drawY(Dview,view);
                 }

                 model.xWins(Dview,view);
                 model.yWins(Dview,view);

                 if(model.isxWins()) {

                     model.resetGame(Dview);

                 }

                 if(model.isyWins()) {

                     model.resetGame(Dview);

                 }

                 if(!model.isxWins() && !model.isyWins() && model.getClick()==10) {


                     view.showMessage(view,"Tie!!!");
                     model.resetGame(Dview);

                 }

             }
         });
    }

    private void startButtonPressed() {

         view.getStartButton().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

                 Dview.RunDrawing();
                 model.initLabelStates();

             }
         });
    }

    private void exitButtonPressed() {

         view.getExitButton().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

                 System.exit(0);

             }
         });
    }

    private void restartButtonPressed() {

         view.getRestartButton().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {

                 model.resetGame(Dview);

             }
         });
    }

}
