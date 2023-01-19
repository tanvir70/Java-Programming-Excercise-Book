package book.ChapterSeven;

public class ListUtils {
    public <T extends Comparable<T>> T max (T[] list){
        if ( list == null || list.length ==0){
            throw new IllegalArgumentException("Cannot find maximum of empty list.");
        }
        T max = list[0];
        for (T item: list) {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ListUtils lu = new ListUtils();
        Integer[] a = { 1, 4, 6, 7, 2, 10};
        var list = lu.max(a);
        System.out.println("Max value = " + list);

    }
}
