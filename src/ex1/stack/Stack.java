package ex1.stack;


public class Stack {

    private static final int DEFAULT_SIZE = 10;

    private static final int EMPTY_STACK = -100000;
    private final int[] elements;
    private int currentSize;

    public Stack(int initSize) {
        currentSize = 0;
        elements = new int[initSize];
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public int pop() {
        if (currentSize < 1)
            return EMPTY_STACK;

        return elements[--currentSize];
    }

    public void push(int e) {
        if(currentSize < elements.length)
            elements[currentSize++] = e;
    }

    @Override
    public String toString() {
        boolean first = true;
        String str = "{";
        for (int i = 0; i < currentSize; i++) {
            if (first) {
                first = false;
            } else {
                str += " , ";
            }
            str += elements[i];
        }

        str += "}";

        return str;
    }

}
