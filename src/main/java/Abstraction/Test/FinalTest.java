package Abstraction.Test;

import Abstraction.Abstractinterfaces.Vehicle;
import Abstraction.Abstractinterfaces.Vehicle2;
import Abstraction.abstractclasses.MyVehilcle;

public class FinalTest {
    public static void main(String args[]){
     /*   Test t = new Test();
        t.Bus();
        t.Car();
        t.Train();
        t.Bicycle();
        t.ship();
     System.out.println("-----------");

        Test1 t1 = new Test1();
        t1.Bus();
        t1.Bike();
        t1.Car();
        t1.Train();
        t1.Jetplane();
        t1.ship();
        t1.helicopter();
        t1.Aeroplane();

        System.out.println("-----------");

        Test2 t2 = new Test2();
        t2.Bus();
        t2.Bike();
        t2.Car();
        t2.Train();
        t2.ship();
        t2.boat();
        t2.Ferry();
*/

         Vehicle2 V2 = new Test2(); // Run time polymohrphism
         V2.ship();



    }




}
