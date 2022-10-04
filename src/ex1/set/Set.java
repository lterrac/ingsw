package ex1.set;

public class Set {
    private static final int DEFAULT_SIZE = 100;
    private final int[] elements;
    private int currentSize;

    public Set(int dimension) {
        currentSize = 0;
        elements = new int[dimension];
    }

    public Set() {
        this(DEFAULT_SIZE);
    }

    public boolean isMember(int element) {
        for(int i = 0; i < currentSize; i++) {
            if (element == elements[i])
                return true;
        }
        return false;
    }

    public void add(int element) {
        if (isMember(element) || currentSize == elements.length)
            return;

        elements[currentSize] = element;
        currentSize++;
    }

    public void delete(int element) {
        int i = 0;

        while(i < currentSize) {
            if(element == elements[i]) {
                currentSize--;
                while(i < currentSize) {
                    elements[i] = elements[i + 1];
                    i++;
                }
                return;
            }
            i++;
        }
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
