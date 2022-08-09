package Overloading;
// A method is said  to be overloaded when it has same method name with diffrent  arguments


public class overloadingExample {

    public void add(int i){
        System.out.println(i);
    }

    public void add(int i, int j){
        System.out.println(i+"--------"+j);
    }


    public void add(int i, int j,int k){
        System.out.println(i+"--------"+j+"-------"+k);
    }


}
