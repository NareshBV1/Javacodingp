package AccessModifiers.package1;

/*It is a modifier applicable to classes, methods, and variables. If we declare a parent class method as final then
we can’t override that method in the child class because its implementation is final and if a class is declared as
final we can’t extend the functionality of that class i.e we can’t create a child class for that class i.e inheritance
is not possible for final classes. Every method present inside the final class is always final y default, but every variable
present inside the final class need not be final. The main advantage of the final keyword is we can achieve security and
we can provide a unique implementation. But the main disadvantage of the final keyword is we are missing key benefits of OOPs like
Inheritance(Because of the final class), Polymorphism(Because of the final method)  hence if there are no specific requirements
then it is not recommended to use the final keyword.
 */

final class FinalExample {
      final int i = 3;

      final void M1(){
          System.out.println("Final class M1");
      }
}
