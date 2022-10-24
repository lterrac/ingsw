package ex4.iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericStack<T> implements Stack<T>, Iterable<T> {

    LinkedList<T> data = new LinkedList<>();
    private int limit;

    public GenericStack(int max){
        limit = max;
    }

    public GenericStack(){
        this(1);
    }

    @Override
    public void push(T elem) throws OutOfSpaceException {
        if (data.size() == limit)
            throw new OutOfSpaceException();
        data.addFirst(elem);
    }

    @Override
    public T pop() throws OutOfDataException {
        if(data.size() == 0)
            throw new OutOfDataException();
        return data.removeFirst();
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }

    public boolean isFull(){
        return data.size() == limit;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericStack.GenericStackIteratorInternal<>(this);
    }

    public static class GenericStackIteratorInternal<P> implements Iterator<P> {

        private GenericStack<P> stack;
        private int cur;

        public GenericStackIteratorInternal(GenericStack<P> stack){
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

    public class GenericStackIteratorInternal2 implements Iterator<T>{
        private int cur = 0;

        @Override
        public boolean hasNext() {
            return cur < data.size();
        }

        @Override
        public T next() {
            return data.get(cur++);
        }
    }




    public static void main(String[] args) throws OutOfSpaceException{
        GenericStack<String> s1 = new GenericStack<>();

        s1.push("abc");
        s1.push("def");
        s1.push("ghi");


        Iterator<String> it = s1.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        for(String s : s1)
            System.out.println(s);


    }

}
