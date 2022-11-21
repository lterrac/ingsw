package ex6.multithreading;

import java.util.List;

public class Minimizer extends Thread {

    private final List<Integer> data;
    private final int b;
    private final int e;

    private int min;

    public Minimizer(List<Integer> data, int b, int e){
        this.data = data;
        this.b = b;
        this.e = e;
    }

    @Override
    public void run() {
        int limit = Integer.min(e, data.size());
        min = Integer.MAX_VALUE;
        for(int i = b; i < limit; i++){
            min = Integer.min(min, data.get(i));
        }
        System.out.println("Local min: "+ min);
    }

    public int getMin(){
        return min;
    }
}
