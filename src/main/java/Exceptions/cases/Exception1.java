package Exceptions.cases;
/*
An unwanted unexpected event that disturbs our normal flow of our program is called exception.
Purpose of exception handling is to gracefully terminate the program
Define the alternate way to continue the rest of the program normally.
 */
public class Exception1 {
    public static void main(String args[]){
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
