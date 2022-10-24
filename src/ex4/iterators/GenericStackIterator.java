package ex4.iterators;

import java.util.Iterator;

public class GenericStackIterator<P> implements Iterator<P> {

    private GenericStack<P> stack;
    private int cur;

    public GenericStackIterator(GenericStack<P> stack){
        this.stack = stack;
        cur = 0;
    }

    @Override
    public boolean hasNext() {
        return cur < stack.data.size();
    }

    @Override
    public P next() {
        return stack.data.get(cur++);
    }
}
