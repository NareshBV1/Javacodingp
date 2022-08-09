package Overloading;


//In overloading method resolution is always take care by compiler based on reference type hence overloading is
//also considered as compile time polymorphism or static polymorphism or early binding

public class Test {
    public static void main(String args[]){
        overloadingExample2 v = new overloadingExample2();
        v.multiply(10);
        v.multiply(10,20);
        v.add(10);
        v.add(10,20,30);

        // Equating parent reference with child class
        overloadingExample v1 = new overloadingExample2();
        v1.add(9);
        v1.add(9,3);
        v1.add(8,9,7);

        // Here we cant call the child methods because method resolution is always taken care by the compiler
        //v1.muliply(10)


        // Automatic promation
        Case1Automaticpromation c = new Case1Automaticpromation();
        c.M1(10);
        c.M1(10f);


        c.M1('a');   // char is promoting to int
        c.M1(10l);    // int is promoting to float

       //c.M1(10.5);//it's an error because  we are giving the double which comes after float automatic promotion is not possible

        // Case2StringandObject
        Case2stringObject c1 = new Case2stringObject();
        c1.m1("Name is Naresh"); // it will take string
        c1.m1(c1); // it will take object
        c1.m1(null); // it ll take string

        //Case3StringandStringbuffer
        Case3stringandstringbuffer c3 = new Case3stringandstringbuffer();
        c3.m1("cool");
        //c3.m1(null);  // Error because String and string buffer at the same level

        //Case4Example
        Case4Example c4 = new Case4Example();
        c4.M1(10,10.5f);
        c4.M1(10.5f,10);

        // c4.M1(10,10); -- Error because both are matching ambigus error

       //   c4.M1(10.5f,10.5f);  -- Error float cant be converted into int






    }
}
