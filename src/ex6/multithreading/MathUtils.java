package ex6.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    // l = [15, 29, -2, 4, -20, 8, 14, 63, 0, 1]
    public static int minOf(List<Integer> l, int s){

        int partitionSize = (int) Math.ceil((double)l.size() / (double)s);
        int i = 0;

        List<Minimizer> ts = new ArrayList<>();
        while(true){
            Minimizer m = new Minimizer(l, i, i+partitionSize);
            ts.add(m);
            m.start();
            if(i+partitionSize >= l.size()) break;
            i += partitionSize;
        }

        int min = Integer.MAX_VALUE;
        for(Minimizer m : ts){
            try {
                m.join();
                min = Integer.min(min, m.getMin());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return min;
    }

    public static void main(String[] args){
        List<Integer> res = new ArrayList<>();
        res.add(10);
        res.add(-9);
        res.add(-2);
        res.add(14);
        res.add(-6);
        res.add(8);
        res.add(99);
        res.add(100);
        res.add(-1);
        res.add(0);
        System.out.println("Minimo globale: "+minOf(res, 3));
    }
}
