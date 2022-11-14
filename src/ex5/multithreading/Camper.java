package ex5.multithreading;

public class Camper implements Runnable {

    private Pot pot;
    private String name;

    public Camper(Pot pot, String name){
        this.pot = pot;
        this.name = name;
    }


    @Override
    public void run() {
        while(true){
            pot.getPart(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
