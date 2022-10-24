package ex4.iterators;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int num1, num2, pos;

    public FibonacciIterator(){
        num1 = 1;
        num2 = 1;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (pos == 0 || pos == 1) {
            pos++;
            return 1;
        }
        pos++;
        int res = num1+num2;
        num1 = num2;
        num2 = res;
        return res;
    }

    public static void main(String[] args){
        FibonacciIterator it = new FibonacciIterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
