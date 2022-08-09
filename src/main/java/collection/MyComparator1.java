package collection;

import java.util.Comparator;

public class MyComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = o1.toString();
        String obj2 = o2.toString();

        //return obj1.compareTo(obj2); ascending order
       // return obj2.compareTo(obj1); return descending order
        return +1;
    }
}
