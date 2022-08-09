package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// Underlying data structure is Double linked list
// Duplicates are allowed
// insertion order is preserved
// Heterogeneous elements are allowed
// insertion null is allowed


// Linked list is the best choice for when you want to insert or delete  a element in the middle of the array.

public class Linkedlist {

    public static void main(String args[]){
        LinkedList l1 = new LinkedList();
       l1.add("Test1");
       l1.add("Test2");
       l1.add("Test3");
       l1.add("Test1");
       l1.add(4,45);

       LinkedList l2 = new LinkedList();
       l2.add("Text1");
       l2.add("Text2");
       l2.add("Text3");





       // Adding objects
        l1.add(5,"Test7");
        l1.addAll(l2);
        l1.addAll(6,l1);
        l1.addFirst("Test0");
        l1.addLast("Test5");

        //Acccessing objects:
        l1.get(1);
        l1.indexOf("Text1");
        l1.lastIndexOf("Text1");
        l1.contains("Text1");
        l1.containsAll(l2);
        l1.element();  //Retrive the first element of the list
        l1.getFirst();
        l1.getLast();

       // Removing objects
        l1.removeFirst();
        l1.removeLast();
        l1.remove("Test2");
        l1.remove(2);
        l1.remove();  //Remove the first element
        l1.removeFirstOccurrence("Test1");
        l1.removeLastOccurrence("Test1");
        l1.removeAll(l2);

        // Clone
        LinkedList l3 = (LinkedList) l1.clone();

        //other methods
         l2.clear();
         l2.isEmpty();

         LinkedList l4 = new LinkedList();
         l4.add("Take1");
         l4.add("Take2");
         l4.add("Take3");

       Iterator itr = l4.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator litr = l4.listIterator();

        while (litr.hasNext()){
            System.out.println(litr.next());
        }

            while (litr.hasPrevious()){
                System.out.println(litr.previous());

                }
            }


        }



