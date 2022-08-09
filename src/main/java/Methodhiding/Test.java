package Methodhiding;
/*
1.	Both parents and child class methods should be  static.  Vs  Both parents and child class methods  should be  non  static
2.	Compile is responsible for method resolution based on reference type.   Vs JVM is always responsible for method resolution based on run time object
3.	It is also known as compile time polymorphism or early binding. Vs it also known as run time polymorphism / dynamic polymorphism/late binding.
*/

public class Test {
    public static void main(String args[]){
        Class2 c = new Class2();
        c.m11();

        Class1 c1 = new Class2();
        c1.m11();

    }

}
