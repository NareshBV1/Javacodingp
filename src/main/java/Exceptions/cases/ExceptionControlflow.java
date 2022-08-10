package Exceptions.cases;

public class ExceptionControlflow {
    public static void main(String args[]){
        try {
            System.out.println("stmt-1");
             int i = 2/0;
            System.out.println("stmt-2");
            System.out.println("stmt-3");
        }catch (Exception e){
            System.out.println("Stmt-4");  // If exception raised at Stmt-4  it's an abnormal termination
        }
        System.out.println("Stmt-5");
    }
}
