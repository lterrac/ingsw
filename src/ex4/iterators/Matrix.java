package ex4.iterators;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Matrix<E> implements Iterable<E> {

    private List<List<E>> data;

    private int n, m;

    public Matrix(int n, int m, E defaultValue){
        this.n=n;
        this.m=m;
        data = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            List<E> col = new ArrayList<>(m);
            data.add(col);
            for (int j = 0; j < m; j++){
                col.add(defaultValue);
            }
        }
    }

    public int getRows(){
        return n;
    }

    public int getColumns(){
        return m;
    }

    public E get(int row, int col){
        return data.get(row).get(col);
    }

    public void add(int row, int col, E elem){
        List<E> selectedRow = data.get(row);
        selectedRow.remove(col);
        selectedRow.add(col, elem);
    }

    /*public Iterator<E> iterator(){
        return new MatrixIterator<>(this);
    }*/
    @Override
    public Iterator<E> iterator(){
       return new MatrixIterator();
   }

    public String toString(){
        String res = "";
        for (List<E> col : data){
            res += "["+col.get(0);
            for (E elem : col.subList(1, col.size()))
                res += "," + elem;
            res += "]\n";
        }
        return res;
    }


    public static void main(String[] args) throws OutOfDataException {
        Matrix<String> matrix = new Matrix<>( 2, 3, "-");
        matrix.add(0, 0, "a");
        matrix.add(0, 1, "b");
        matrix.add(0, 2, "c");
        matrix.add(1, 0, "d");
        matrix.add(1, 1, "e");
        matrix.add(1, 2, "f");


        System.out.println(matrix);
        Iterator<String> it = matrix.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


    private class MatrixIterator implements Iterator<E> {
        int col, row = 0;


        @Override
        public boolean hasNext() {
            return row < getRows();
        }

        @Override
        public E next() {

            E res = get(row, col);
            col++;
            if (col > getColumns()-1) {
                col = 0;
                row++;
            }

            return res;
        }
    }

}
