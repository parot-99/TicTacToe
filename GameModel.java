package _TicTacToe;

public class GameModel {

    private int click = 1;

    private boolean labelState1;
    private boolean labelState2;
    private boolean labelState3;
    private boolean labelState4;
    private boolean labelState5;
    private boolean labelState6;
    private boolean labelState7;
    private boolean labelState8;
    private boolean labelState9;

    private boolean xWins=false;
    private boolean yWins=false;

    public void checkPressed() {

        this.click++;

    }


    public void resetGame(DrawingView dView) {

        this.click=1;

        this.xWins=false;
        this.yWins=false;

        dView.resetView();
        initLabelStates();

    }

    public void initLabelStates() {

        this.labelState1 = true;
        this.labelState2 = true;
        this.labelState3 = true;
        this.labelState4 = true;
        this.labelState5 = true;
        this.labelState6 = true;
        this.labelState7 = true;
        this.labelState8 = true;
        this.labelState9 = true;

    }


    public void drawX(DrawingView dView,TextFieldView view) {

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState1) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState1=false;

            checkPressed();
            dView.drawX(0);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState2) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState2=false;

            checkPressed();
            dView.drawX(1);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState3) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState3=false;

            checkPressed();
            dView.drawX(2);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState4) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState4=false;

            checkPressed();
            dView.drawX(3);
            view.clearTextField();


        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState5) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState5=false;

            checkPressed();
            dView.drawX(4);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState6) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState6=false;

            checkPressed();
            dView.drawX(5);
            view.clearTextField();


        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState7) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState7=false;

            checkPressed();
            dView.drawX(6);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState8) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState8=false;

            checkPressed();
            dView.drawX(7);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState9) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState9=false;

            checkPressed();
            dView.drawX(8);
            view.clearTextField();

        }

    }

    public void drawY(DrawingView dView, TextFieldView view) {

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState1) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState1=false;

            checkPressed();
            dView.drawY(0);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState2) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState2=false;

            checkPressed();
            dView.drawY(1);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("1")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState3) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState3=false;

            checkPressed();
            dView.drawY(2);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState4) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState4=false;

            checkPressed();
            dView.drawY(3);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState5) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState5=false;

            checkPressed();
            dView.drawY(4);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("2")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState6) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState6=false;

            checkPressed();
            dView.drawY(5);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("1")) {

            if(!this.labelState7) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState7=false;

            checkPressed();
            dView.drawY(6);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("2")) {

            if(!this.labelState8) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState8=false;

            checkPressed();
            dView.drawY(7);
            view.clearTextField();

        }

        if(view.getTextField1().getText().equals("3")&&view.getTextField2().getText().equals("3")) {

            if(!this.labelState9) {

                view.showMessage(view,"Move already played");
                view.clearTextField();
                return;
            }

            this.labelState9=false;

            checkPressed();
            dView.drawY(8);
            view.clearTextField();

        }

    }

    public void xWins(DrawingView dView,TextFieldView view) {


        if(dView.getLabels().get(0).getText().equals(" x")&&dView.getLabels().get(1).getText().equals(" x")&&dView.getLabels().get(2).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(3).getText().equals(" x")&&dView.getLabels().get(4).getText().equals(" x")&&dView.getLabels().get(5).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(6).getText().equals(" x")&&dView.getLabels().get(7).getText().equals(" x")&&dView.getLabels().get(8).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(0).getText().equals(" x")&&dView.getLabels().get(3).getText().equals(" x")&&dView.getLabels().get(6).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(1).getText().equals(" x")&&dView.getLabels().get(4).getText().equals(" x")&&dView.getLabels().get(7).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(2).getText().equals(" x")&&dView.getLabels().get(5).getText().equals(" x")&&dView.getLabels().get(8).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(2).getText().equals(" x")&&dView.getLabels().get(4).getText().equals(" x")&&dView.getLabels().get(6).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

        if(dView.getLabels().get(0).getText().equals(" x")&&dView.getLabels().get(4).getText().equals(" x")&&dView.getLabels().get(8).getText().equals(" x")) {

            view.showMessage(view,"X WON!");
            this.xWins=true;


        }

    }

    public void yWins(DrawingView dView,TextFieldView view) {


        if(dView.getLabels().get(0).getText().equals(" o")&&dView.getLabels().get(1).getText().equals(" o")&&dView.getLabels().get(2).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(3).getText().equals(" o")&&dView.getLabels().get(4).getText().equals(" o")&&dView.getLabels().get(5).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(6).getText().equals(" o")&&dView.getLabels().get(7).getText().equals(" o")&&dView.getLabels().get(8).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(0).getText().equals(" o")&&dView.getLabels().get(3).getText().equals(" o")&&dView.getLabels().get(6).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(1).getText().equals(" o")&&dView.getLabels().get(4).getText().equals(" o")&&dView.getLabels().get(7).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(2).getText().equals(" o")&&dView.getLabels().get(5).getText().equals(" o")&&dView.getLabels().get(8).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(2).getText().equals(" o")&&dView.getLabels().get(4).getText().equals(" o")&&dView.getLabels().get(6).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

        if(dView.getLabels().get(0).getText().equals(" o")&&dView.getLabels().get(4).getText().equals(" o")&&dView.getLabels().get(8).getText().equals(" o")) {

            view.showMessage(view,"O WON!");
            this.yWins=true;


        }

    }

    public  int getClick() {

        return this.click;

    }

    public boolean isxWins() {

        return xWins;

    }

    public boolean isyWins() {

        return yWins;

    }

    public void checkValidInput(TextFieldView view, DrawingView dView) {

        if(view.getTextField1().getText().compareTo("3")>0) {

            view.showMessage(view,"Wrong input");
            view.clearTextField();
            return;

        }

        if(view.getTextField2().getText().compareTo("3")>0) {

            view.showMessage(view,"Wrong input");
            view.clearTextField();
            return;

        }

        if(view.getTextField1().getText().compareTo("1")<0) {

            view.showMessage(view,"Wrong input");
            view.clearTextField();
            return;

        }

        if(view.getTextField2().getText().compareTo("1")<0) {

            view.showMessage(view,"Wrong input");
            view.clearTextField();
            return;

        }

    }

}
