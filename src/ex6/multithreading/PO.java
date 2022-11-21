package ex6.multithreading;

public class PO implements Runnable {

    private Buffer[] buffers;

    public PO(Buffer[] buffers){
        this.buffers = buffers;
    }
    @Override
    public void run() {
        while(true){
            for(int i=0; i < buffers.length; i++){
                char ch = buffers[i].get();
                System.out.println("---Buffer "+i+": "+ch+"---");
            }
        }
    }
}
