package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

// Underlying data structure is hash table
// Duplicates are not allowed , if you are adding duplicates it won,t throw any compiler error. Error ll be thrown during run time.
// insertion order is not preserved , oreder ll be based on hashcode
// null insertion is possible
// Hashset ll not implement the ramdom access interface so it's not a good choice for retrival.
// Hashset is a good choice for search the objects.
public class hashset {
    public static void main(String args[]){
        // Constructors
        HashSet h = new HashSet(); // Default intial capacity is 16
        h.add("Test1");
        h.add("Test2");
        HashSet h1 = new HashSet(10);
        HashSet h2 = new HashSet(h);

        //Adding Elements
        h1.add("Test0");
        h1.addAll(h);

        // Accessing elements
        h1.contains("Test1");
        h1.containsAll(h);
        h1.size();
        h1.isEmpty();
        Object O[] = h1.toArray();

        for (Object object: h1) {
            System.out.println(object);
        }

        Iterator it = h1.iterator();
        while(it.hasNext()){
            if(it.next().equals("Test1")){
                System.out.println("Element found");
            }
        }
        h1.remove("Test1");
        h1.removeAll(h2);
        h1.clear();
        h1.isEmpty();


    }
}
