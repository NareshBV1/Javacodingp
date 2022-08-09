package Controlflow.MixedControlflow;

public class Base1 extends Base {
    static int h ;
    int y = 78;

    public Base1( int y) {
        super(10);
        this.y = y;
        System.out.println("Base1 Constructor");
    }

    {
        System.out.println("Second instance block");
    }

    static {
        System.out.println("Second static block");
    }

}
