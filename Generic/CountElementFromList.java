package book.Generic;

import java.util.ArrayList;
import java.util.List;

public class CountElementFromList {

        public <T> int checkList(List<T> list, T elemnt) {

            int count = 0;

            if ((list == null) || (list.size() == 0)) {
                throw new IllegalArgumentException("Cannot find maximum of empty list.");
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(elemnt)) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            CountElementFromList ce = new CountElementFromList();
            List<Integer> a = new ArrayList<>();
            a.add(5);
            a.add(10);
            a.add(12);
            a.add(13);
            a.add(1);
            a.add(12);

            var b = ce.checkList(a,12);
            System.out.println( b );
        }
    }

