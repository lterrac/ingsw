package ex3.generics.stack;


import java.util.ArrayList;

public class Stack<T> {


    private static final int DEFAULT_SIZE = 10;

    private final ArrayList<T> elements;

    private final int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        elements = new ArrayList<>(maxSize);
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public T pop() throws OutOfDataException {
        if (elements.size() < 1)
            throw new OutOfDataException();
        return elements.remove(elements.size() - 1);
    }

    public void push(T e) {
        try {
            if (elements.size() == maxSize)
                throw new FullOfDataException();
            elements.add(e);
        } catch (FullOfDataException ex) {
            System.out.println("current size e' piu' grande di elements.length");
            System.out.println(ex.message());
        }
    }

    @Override
    public String toString() {
        boolean first = true;
        String str = "{";
        for (T element: elements) {
            if (first) {
                first = false;
            } else {
                str += " , ";
            }
            str += element;

        }
        str += "}";

        return str;
    }

}
