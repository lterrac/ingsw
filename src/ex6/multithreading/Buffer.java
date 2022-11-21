package ex6.multithreading;

public class Buffer {

    private char c;
    private boolean full;

    public synchronized void put(char c){
        while(full){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.c = c;
        full = true;
        notifyAll();
    }

    public synchronized char get(){
        while(!full){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        full = false;
        notifyAll();
        return c;
    }



    public static void main(String[] args){
        Buffer[] bfs = {
                new Buffer(),
                new Buffer(),
                new Buffer(),
                new Buffer()
        };

        String[] commands = {"1,a", "1,b"};

        PI pi = new PI(bfs, commands);
        PO po = new PO(bfs);

        new Thread(pi).start();
        new Thread(po).start();

    }

}
