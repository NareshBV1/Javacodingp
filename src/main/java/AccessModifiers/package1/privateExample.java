package AccessModifiers.package1;

/*Private methods and data members can only be accessed from within the class I. which they have been declared. They are specified using
        the private keyword. These modifiers cannot be accessed from outside the class or from any other outside package. Private
        Access Modifiers cannot be declared for any class or interface.*/
// We can't declare  class and interface is private
 class privateExample {
     private int i = 3;

     private void M1(){
         System.out.println("Method M1");
     }



}

