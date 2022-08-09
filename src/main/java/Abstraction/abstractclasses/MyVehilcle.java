package Abstraction.abstractclasses;

import Abstraction.Abstractinterfaces.Vehicle;
import Abstraction.Abstractinterfaces.Vehicle2;

public abstract  class MyVehilcle implements Vehicle {
    @Override
    public void Bus() {
     System.out.println(" MyVehilcle Bus");
    }

    @Override
    public void Train() {
        System.out.println(" MyVehilcle Train");
    }

    @Override
    public void Car() {
        System.out.println("MyVehilcle Car");
    }

    @Override
    public void Bike() {
        System.out.println("MyVehilcle Bike");
    }

    @Override
    public void ship() {
        System.out.println("MyVehilcle ship");
    }

    protected abstract void Bicycle();

}
