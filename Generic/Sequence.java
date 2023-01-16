package book.Generic;

import java.util.ArrayList;

public class Sequence<T> {

    private ArrayList<T> list;
    private int count = 0;

    public Sequence(){
        list = new ArrayList<T>();
    }

    public void add(T element) {
        list.add(element);
        count++;
    }

    public int count() {
        return count;
    }

    public void remove(T element) {
        list.remove(element);
        count--;
    }

    public void print() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Sequence<Integer> sq = new Sequence<>();

        sq.add(10);
        sq.add(20);
        sq.add(30);
        sq.add(40);
        System.out.println("Count : " + sq.count);
        sq.print();
        sq.remove(20);
        System.out.println("Count : " + sq.count);
        sq.print();

    }
}
