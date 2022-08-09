package collection;
import java.lang.reflect.Array;
import java.util.*;

public class vector {

    // Underlying data structure is resizable array or growable array
    // Duplicate elements are allowed.
    // Insertion order is preserved
    //  null insertion is possible
    // all methods inside the vector class is synchornized hence it is thread safe
    // This class implemerts the Ramdom access interface so it's a best choice for  retrival operqtion



    public static void main(String args[]) {
        // Constructors
        Vector v = new Vector(10);
        Vector v1 = new Vector(10, 20);
        v1.add("Pok1");
        v1.add("pok2");
        //Vector v2 = new Vector(v);
        //Adding elements
        v.addElement("Rest1");
        v.addElement("Rest2");
        v.add(4);
        v.addAll(v1);

        //Accessing Elements
        System.out.println(v.indexOf("Rest2"));
        System.out.println(v.firstElement());
        System.out.println(v.elementAt(2));
        System.out.println(v.contains("Pok1"));
        System.out.println(v.containsAll(v1));
        // vector is having methods derived from  Collection and List interfaces , there are few vector specific methods
        v.capacity();
        v.isEmpty();
        v.size();
        v.set(1, "Rest5");
        v.replaceAll(object -> object.toString().toUpperCase());


        // Enumeration , its only applicable for legacy classes
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        //Iterators
        Iterator l = v.iterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
System.out.println("---------------------");
        ListIterator lit = v.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("---------------------");
        // List iterators -- Backward reference
        while(lit.hasPrevious()){
            System.out.println(lit.previous());

        }

        Object[] O  = v.toArray();
        System.out.println(O.length);
        v.remove(1);
        v.remove("POK1");
        v.clear();

    }


    }



