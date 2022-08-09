package Overloading;

/*Byte --> Short -->int--> long --> float --> float --> double

char --> Short -->int--> long --> float --> float --> double


While resolving overloaded methods if exact matched method is not available then we won't get any compile time error
        immediately. First it will promote argument to the next level and check whether matched method is available or not ,
        If matched method is available then it ll be considered .

If the matched method is not available then compiler promotes arguments once again to the next level.
        This process will be continued  until all possible promotions. Still id the matched method is not
        available we ll get compile time error. */


public class Case1Automaticpromation {

    public void M1(int i){
        System.out.println(i);
    }

    public void M1(float f){
        System.out.println(f);

    }




}
