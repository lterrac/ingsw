package ex5.multithreading;

public class Pot {

    private final int P = 40;
    private int parts = P;

    public synchronized void getPart(String name){

        while(parts <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        parts--;
        System.out.println("Camper "+name+" obtained a part, remaining parts "+parts);

        notifyAll();


    }

    public synchronized void fill(){
        while (parts > 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Chef refilled the pot");

        parts = P;

        notifyAll();

    }

    public static void main(String[] args){
        Pot pot = new Pot();

        new Thread(new Chef(pot)).start();
        new Thread(new Camper(pot, "A")).start();
        new Thread(new Camper(pot, "B")).start();
        new Thread(new Camper(pot, "C")).start();
        new Thread(new Camper(pot, "D")).start();
        new Thread(new Camper(pot, "E")).start();

    }
}

