package ex4.iterators;

import java.util.Iterator;

public class MatrixIterator<E> implements Iterator<E> {

    private Matrix<E> data;

    int col, row = 0;

    public MatrixIterator(Matrix<E> matrix){
        data = matrix;
    }

    @Override
    public boolean hasNext() {
        return row < data.getRows();
    }

    @Override
    public E next() {

        E res = data.get(row, col);
        col++;
        if (col > data.getColumns()-1) {
            col = 0;
            row++;
        }

        return res;
    }
}
