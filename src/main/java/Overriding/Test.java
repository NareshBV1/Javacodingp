package Overriding;

/*Whatever methods parent has  by default available to the child through inheritance. If child class not satisfied
        with parent class implementation then child is allowed to redefine that method based on its requirement.
        This process is called overriding.

The parent class method which is overridden is called overridden method and the child class method which is
     overriding is called overriding method.
 */

// For overiding  method signature should be same

public class Test {
    public static void main(String args[]){

        Dog d = new Dog();
        d.walk();

        /* In overriding method signature is always taken care by the JVM based on runtime object this called Runtime
         polymorphosim or dynamic binding or late binding
         */
         // Equating parent reference to child object
          Animal a = new Dog();
          a.walk();


         // Case 1: Return type may not be same and it ll accept co-variant return types
             a.M1();

         /* Case 2 : 	Parent class private methods not available to the child and hence overriding concept not applicable
                for private methods. Based on our requirement we can define exactly same private method in child class it is valid but not overriding.*/
                 // a.M2();

        /* Case 3 :  Parent class final methods we can't override because once method is  declared as implemention is final*/

        /* Case4 : We can provide the method implemention for the abstract methods */
            a.M5();

        /*Case 5 : We can't reduce the scope for access modifiers*/

        /* Case 6 : 11.	If child class method throws any checked exception  Compulsory parent class method should throw same checked exception or
        it’s parent otherwise we will get compile time error but there are no restrictions for unchecked exceptions */


         /* We can't override static methods as non static aas static and vice versa  */

        /* Overriding concept is not applicable for variables, because varible resolution is taken care by compiler*/























    }



}
