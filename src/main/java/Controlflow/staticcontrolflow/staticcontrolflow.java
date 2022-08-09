package Controlflow.staticcontrolflow;

/*  1.	Identification of static members from top to bottom
    2.	Execution of static variable assignments and static blocks from top to bottom
    3.	Execution of main method
*/

public class staticcontrolflow {
    static int i =10;
    static {
        m1();
        System.out.println("First static block");
    }

    public static void main(String args[]){
      m1();
    }

    public static void m1(){
        System.out.println("Method m1");
    }

    static {
        System.out.println("second static block");
    }

    static int j = 20;
}
