package Inheritance.MultipleinhiritanceInterface;

//Even though multiple method declarations are but implementation is unique and hence there is no chance of ambiguity problem in interfaces.

public class ImplementInterface implements Interface1,Interface2 {
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");

    }

    @Override
    public void m2() {
        System.out.println("m2 method");

    }
}
