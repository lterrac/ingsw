package ex6.multithreading;

public class Plant implements Runnable {

    private enum State {
        OK, STOPPED, BUSY
    }

    private State state;

    public Plant(){
        state = State.OK;
    }
    @Override
    public void run() {
        while(state != State.STOPPED){
            System.out.println("Working...");
            while(Math.random() <= 0.8){
                System.out.println("Status OK!");
            }

            System.out.println("Plant is BUSY");

            state = State.BUSY;

            Valve valve = new Valve();
            Thread valveThread = new Thread(valve);
            valveThread.start();

            synchronized (valve){
                try {
                    valve.wait(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (valve.getState() == Valve.State.CLOSED){
                    System.out.println("Failed!");
                    state = State.STOPPED;
                    break;
                }
            }

            System.out.println("Valve is opened, waiting...");
            try {
                valveThread.join();
                state = State.OK;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){
        new Thread(new Plant()).start();
    }
}
