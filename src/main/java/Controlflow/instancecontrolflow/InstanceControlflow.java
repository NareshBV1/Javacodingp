package Controlflow.instancecontrolflow;

 /*    1.	Identification of instance members from top to bottom
       2.	Execution of instance variables assignments and instance blocks from top to bottom
       3.	Execution of constructor

*/

public class InstanceControlflow {

        int j = 20;


    {
        M2();
        System.out.println("First instance block");
    }

    public InstanceControlflow(){
        System.out.println("First constructor ");
    }
    public static void main(String args[]){
        InstanceControlflow I = new InstanceControlflow();
       I.M2();
    }

    public void  M2(){
        System.out.println("Method M2");
    }

    {
        System.out.println("Second instance block");
    }

    String str = "Today is sunday";

}
