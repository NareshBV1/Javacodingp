package Overriding;


import java.util.ArrayList;
import java.util.List;

abstract public class Animal {

    public void walk(){
        System.out.println("Animl is walking");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public Object  M1(){
        return  new Test();
    }

    private void M2(){
        System.out.println("Animal private method");
    }

    final void M4(){System.out.println("final method of M5");}

    abstract   void M5();

    public  void M6() throws Exception {
        System.out.println("Animal class M6");
    }

    public static void M7(){
        System.out.println("Method M7");
    }


}
