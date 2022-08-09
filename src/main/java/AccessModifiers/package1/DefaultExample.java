package AccessModifiers.package1;
 // Default class
/*When we do not specify any access level for a class, method, or data members, then it assigns Default Access Modifier.
  The data members, methods, or class inside one package can only be accessed within the package. Any other class or method trying to access the data from outside the
   package or from other packages will not be granted access to the class or method.*/
class DefaultExample {
    // Default data member
    String str;

    // Constructor
      DefaultExample(String str){
          this.str =str;
      }

    void M1(){
        System.out.println("Default class M1");
    }

}
