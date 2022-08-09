package collection;

import java.util.TreeSet;

public class TreesetExample {

    // Underlying data structure is Balanced tree
    // Duplicate objects are not allowed
    // Insertion order is not preserved
    // Heterogeneous objects are not allowed
    // Null insertion is allowed once.

    public static void main(String args[]){
        TreeSet s= new TreeSet(new MyComparator1()); // it applies the default sorting order
        s.add("Naresh");
        s.add("Suresh");
        s.add("Ramesh");
        s.add("Vignesh");

        System.out.println(s);
       // s.add(10); // Heterogenoues pbjects are allowed otherwise we ll get class cast exception
        // s.add(null); // By default its sorting order when it is sorting it has to copare objects with null , well get null pointer exception
        // Default constructor always have the comparable interface()  and it's having compareto() method
    /*  TreeSet s1= new TreeSet(new MyComparator());
        s1.add(10);
        s1.add(5);
        s1.add(11);
        s1.add(3);
        //System.out.println(s1); */





    }


}
