package Exceptions.cases;
/* The exceptions which are checked by compiler for the smooth execution of a program
at run time weather programmer handling or not is called checked exceptions
    1. IOexception
    2. File not found exception
    */


/* Exceptions which are not checked by compiler is called unchecked exceptions
*  EG ; All Runtime exceptions are unchecked exceptions
*    1.Arthamtic exception
*    2. out of bound exception
*    3. Illegal argument exception
*    4 .Null pointer exception*/


public class checkedvsunchecked {

    public void test() throws InterruptedException {   // this is checked exception
        Thread.sleep(10);
    }

    public void test1(){
        System.out.println("Stmt-1");
        int i = 2;
        try {
            int x = i/0;
        }catch (ArithmeticException A){
            System.out.println("stmt-2");
            System.out.println(A.getMessage());
            int x = 10/2;
        }
        System.out.println("Stmt-3");
    }


}
