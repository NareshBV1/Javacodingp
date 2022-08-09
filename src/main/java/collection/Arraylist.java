package collection;


import java.util.*;

// Collection(I) --> List(I) --> ArrayList()
// Duplicates are allowed
// Insertion order is preserved
// Default capacity 10
// Arraylist will be accessing the Random access interface
// Arraylist is a good choice for Retrival operation

public class Arraylist {
    public static void main(String args[]){
        ArrayList Al1 = new ArrayList();
        Al1.add("Alex");
        Al1.add(1,"Jim");


        ArrayList Al2 = new ArrayList();
        Al2.add("Alex");
        Al2.add(55);


        ArrayList Al3 = new ArrayList();

        //Adding methods
        Al3.add("Alex");
        Al3.add("jim");
        Al3.add(23);
        Al3.addAll(Al1);
        Al3.addAll(2,Al1);


        //Accessing Arraylist Elements
        Object A = Al2.get(1);
        int b = Al2.indexOf("jim");
        int c = Al2.lastIndexOf("jim");
        boolean val = Al2.contains("23");
        boolean val1 = Al2.containsAll(Al1);

        //Replacing methods
         Al2.set(1,"POPU");
         Al2.replaceAll(object ->object.toString().toUpperCase() );

         // retainsAll
        System.out.println( Al2.retainAll(Al1));
        System.out.println( Al1);

         // Clone
         ArrayList Al5 = (ArrayList) Al2.clone();


         // Other Methods
        int size1 = Al1.size();
        System.out.println(size1);
         Al2.clear();
        boolean Val6 = Al2.isEmpty();
        System.out.println(Val6);


        // Iterator Forward traversing , No backward traversing for iterator
        Iterator it = Al1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Listiterator forward traversing

        ListIterator lit = Al1.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }

        //Listiterator backward traversing
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        }


        // Array list is not non-synchrnized  and not thread safe
        // You can create thread safe Arralylist object
        ArrayList AL7 = new ArrayList();
        List l1= Collections.synchronizedList(AL7);





        }




