package ex5.multithreading;

public class Chef implements Runnable {

    private Pot pot;

    public Chef(Pot pot){
        this.pot = pot;
    }

    @Override
    public void run() {
        while(true){
            pot.fill();
        }
    }
}
