package ex6.multithreading;

public class Valve implements Runnable {

    public enum State {
        OPENED, CLOSED
    }

    private State state;

    public State getState() {
        return state;
    }
    public Valve(){
        state = State.CLOSED;
    }

    @Override
    public void run() {
        System.out.println("Opening...");
        double time = 8000 * Math.random();

        try {
            Thread.sleep((long) time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized(this){
            state = State.OPENED;
            notify();
        }

        System.out.println("Valve opened after "+time+"ms");

        time = 5000 + 5000*Math.random();

        System.out.println("Valve should sleep "+time+"ms");

        try {
            Thread.sleep((long)time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        state = State.CLOSED;
        System.out.println("Valve is now closed");


    }

}
