package book.Generic;

import java.util.Hashtable;

public class ImplementHashTable {
    public static void main (String[] args){
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(1,"Tanvir");
        hashtable.put(2,"Anjum");
        hashtable.put(3,"Rifat");

        System.out.println("The hash table : " +  hashtable);
    }
}
