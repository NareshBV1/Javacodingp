package Controlflow.MixedControlflow;

public class Base {

    static float f = 90;
    int n;
    public Base(int n){
        System.out.println("Base constructor");
        this.n = n;
    }

    static {
        System.out.println("First static block");
    }

    {
        System.out.println("First instance block");
    }

    public static void M1(){
        System.out.println(" Base Static method M!");
    }

    public  void M2(){
        System.out.println(" Base instance method M!");
    }

}
