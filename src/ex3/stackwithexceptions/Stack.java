package ex3.stackwithexceptions;


public class Stack {

    private static final int DEFAULT_SIZE = 10;

    private final int[] elements;
    private int currentSize;

    public Stack(int initSize) {
        currentSize = 0;
        elements = new int[initSize];
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public int pop() throws OutOfDataException {
        if (currentSize < 1)
            throw new OutOfDataException();

        return elements[--currentSize];
    }

    public void push(int e) {
//        if(currentSize >= elements.length) {
        if (currentSize > elements.length) {
            try {
                throw new FullOfDataException();
            } catch (FullOfDataException ex) {
                System.out.println(ex.message());
                return;
            } finally {
                System.out.println("Ho gestito la push");
            }
        }

        elements[currentSize++] = e;
    }

//    public void push(int e) {
//        try {
//            if(currentSize >= elements.length)
//                ////        if(currentSize > elements.length) {
//                throw new FullOfDataException();
//            elements[currentSize++] = e;
//        } catch (FullOfDataException ex) {
//            System.out.println("current size e' piu' grande di elements.length");
//            System.out.println(ex.message());
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Accesso errato all'array");
//        } finally {
//            System.out.println("Ho gestito la push");
//        }
//    }

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
