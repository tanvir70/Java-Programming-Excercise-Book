package book.Generic;

public class ArrayCopier<T> {
    public void copy(T[] from, T[] to) {

        if ( from.length != to.length){
            throw new IllegalArgumentException("Both array should be same size.");
        }

        try {
            System.arraycopy(from, 0, to, 0, from.length);
        }catch (ArrayStoreException | NullPointerException a){
            a.printStackTrace();
        }

        for (int i = 0; i < to.length; i++) {
            System.out.println(to[i] + " " );
        }
    }

    public static void main(String[] args) {
        ArrayCopier<Integer> ac = new ArrayCopier<>();
        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] b = new Integer[5];
        ac.copy(a,b);
    }

}
