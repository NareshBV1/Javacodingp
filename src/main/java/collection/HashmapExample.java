package collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
// Undelying data structure is hash table
// Duplicates keys are not allowed but duplicate values are allowerd
// null insertion is possible
// preserve order is not followed
// heterogeneous objects are allowed

public class HashmapExample {

  public static void main(String args[]){
      HashMap m = new HashMap();
      m.put(1,"Naresh");
      m.put(2,"Suresh");
      m.put(3,"Ramesh");

      HashMap m2 = new HashMap(10);
      m2.putAll(m);


      // Accessing elements
       System.out.println(m2.get(1));
       System.out.println(m2.keySet());
       System.out.println(m2.values());
       System.out.println(m2.containsKey("Naresh"));
       System.out.println(m2.containsValue(1));


       Set  s  = m2.keySet();
      Set S1 = m2.entrySet();
      System.out.println(S1);

      Iterator it =S1.iterator();
      while (it.hasNext()){
         System.out.println(it.next());
      }

  }






}
