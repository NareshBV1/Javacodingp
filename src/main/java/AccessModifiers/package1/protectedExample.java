package AccessModifiers.package1;

/*The methods and data members which are declared as protected are accessible by the classes within the package and
the subclasses of those packages. This type of Access Modifier is specified using the protected keyword. Just like
private access modifiers, protected access modifiers too cannot be declared for classes.
 */
// protected  can't be declare as class and interface
public class protectedExample {
    protected int j = 10;

    protected void M1(){
        System.out.println(" Protected Method M1");
    }



}
