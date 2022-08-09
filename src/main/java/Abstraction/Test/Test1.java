package Abstraction.Test;

import Abstraction.abstractclasses.MyVehicle1;

public class Test1 extends MyVehicle1 {


    @Override
    public void Bus() {
        System.out.println("Test1 Bus");
    }

    @Override
    public void Train() {
        System.out.println("Test1 Train");
    }

    @Override
    public void Car() {
        System.out.println("Test1 Car");
    }

    @Override
    public void Bike() {
        System.out.println("Test1 Bike");
    }

    @Override
    public void ship() {
        System.out.println("Test1 ship");

    }

    @Override
    protected void Jetplane() {
        System.out.println("Jetplane");

    }
}
