package book.Generic;

import java.util.ArrayList;
import java.util.List;

public class CheckList {

    public <T> int checkList(List<T> list, T elemnt) {
        if ((list == null) || (list.size() == 0)) {
            throw new IllegalArgumentException("Cannot find maximum of empty list.");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(elemnt)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CheckList ck = new CheckList();
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(10);
        a.add(12);
        a.add(13);
        a.add(1);

        var b = ck.checkList(a,8);
        System.out.println( b );
    }
}
