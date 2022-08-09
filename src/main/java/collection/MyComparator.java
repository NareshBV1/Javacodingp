package collection;

import java.util.Comparator;

public class MyComparator  implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer obj1 = (Integer) o1;
        Integer obj2 = (Integer) o2;

        //return +1; // original order
        //return -1; // reverse order

        //return obj1.compareTo(obj2); // Ascending order
        // return obj2.compareTo(obj1);// Return descending order
         return -obj1.compareTo(obj2); // Return descending order
    }
}
