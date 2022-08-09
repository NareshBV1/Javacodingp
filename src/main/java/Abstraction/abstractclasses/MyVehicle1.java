package Abstraction.abstractclasses;

import Abstraction.Abstractinterfaces.Vehicle;
import Abstraction.Abstractinterfaces.Vehicle1;
import Abstraction.Abstractinterfaces.Vehicle2;

public abstract class MyVehicle1 implements Vehicle1 {


    @Override
    public void helicopter() {
      System.out.println("MyVehicle1 helicopter");
    }

    @Override
    public void Aeroplane() {
        System.out.println("MyVehicle1 Aeroplane");

    }

    protected abstract void Jetplane();
}
