package AccessModifiers.package1;

public class TestDefault {
    public static void main(String args[]){
        DefaultExample d = new DefaultExample("Today is sunday");
        System.out.println(d.str);
        d.M1();

        // Private classes and Data members we cant access outside the class
        privateExample p = new privateExample();
         // p.M1();

        // Protected class and data members cant be accessed outside the package
        protectedExample p1 = new protectedExample();
        System.out.println(p1.j);
        p1.M1();

        // Final Example
        FinalExample f = new FinalExample();
        f.M1();





    }


}
