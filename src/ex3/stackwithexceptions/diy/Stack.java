package ex3.stackwithexceptions.diy;


import java.util.ArrayList;

public class Stack<T> {

    private static final int DEFAULT_SIZE = 10;

    private final ArrayList<T> elements;
    private int maxSize;

    public Stack(int size) {
        maxSize = 0;
        elements = new ArrayList<>(size);
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
        if(elements.size() >= maxSize) {
            try {
                throw new FullOfDataException();
            } catch (FullOfDataException ex) {
                System.out.println(ex.message());
                return;
            } finally {
                System.out.println("Ho gestito la push");
            }
        }

        elements.add(e);
    }

    @Override
    public String toString() {
        boolean first = true;
        String str = "{";
        for(T element: elements) {
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
