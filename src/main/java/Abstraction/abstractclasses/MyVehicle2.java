package Abstraction.abstractclasses;

import Abstraction.Abstractinterfaces.Vehicle1;
import Abstraction.Abstractinterfaces.Vehicle2;

public  abstract  class MyVehicle2 implements Vehicle2 {

    @Override
    public void ship() {
        System.out.println(" MyVehicle2 ship");
    }

    @Override
    public void boat() {
        System.out.println(" MyVehicle2 boat");
    }

    abstract public void Ferry();
}
