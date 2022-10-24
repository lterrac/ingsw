package ex4.iterators;

public interface Stack<E> {
    void push(E elem) throws OutOfSpaceException;
    E pop() throws OutOfDataException;
}
