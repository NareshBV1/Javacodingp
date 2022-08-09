package Overloading;

/*While resolving overloaded methods compiler will ask gives the precedence
        for child’s type arguments when compared with parent argument*/

public class Case2stringObject {
    public void m1(String str){
        System.out.println(str);
    }

    public void m1(Object O){
        System.out.println(O);
    }
}
