package Inheritance;
// The Main advantage is inheritance
// Whatever methods parent has by default available to the child and hence child reference we can call both parent and child class methods
// Whatever methods child has by default not available to the parent and hence on the parent reference we can’t call child specific methods
// Parent reference can be used to hold child object but using that reference we cant call child specific methods but we can call methods present in parent class. This is called polymorphism.
// Parent reference can be used to hold child object but child reference cannot used to hold parent object.

public class Test {
    public static void main(String args[]){
        // Creating object for the parent class
        Car c = new Car();
        c.Wheels();
        c.Engine();

        // Creating objec for the child reference
        Bmwcar bc = new Bmwcar();
        // Parent class variables
        bc.str1="TestCar";
        bc.a = 4;

        // Parent class methods
        bc.Wheels();
        bc.Engine();

        // Child class Variables
        bc.str2 = "TestBMWCar";
        bc.m = 5;

        // Child class methods
        bc.BmwWheels();
        bc.BmwWheels();

        // Equating parent reference to the child, It can only access to the parent methods ,
        // This is called static ploymorphism or static binding oe Early binding
          Car C = new Bmwcar();   // Top casting
          C.Wheels();
          C.Engine();







    }
}
