package Overriding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Dog extends Animal{

     @Override
    public void walk(){
        System.out.println("Dog is walking");
    }

    public void Bark(){
         System.out.println("Gog is barking");
    }

    @Override
    public Object  M1(){
         String str = "Test123";
        return str ;
    }

    private void M2(){
        System.out.println("Dog private method");
    }

     @Override
       void M5(){
         System.out.println("Implemention for method M5");
    }

    public  void M6() throws IOException {
        System.out.println("Animal class M6");
    }

   /* public  void M7(){
        System.out.println("Method M7");
    } */


}
