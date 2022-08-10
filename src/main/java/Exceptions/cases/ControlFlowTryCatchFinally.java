package Exceptions.cases;

public class ControlFlowTryCatchFinally {
    public  static void main(String args[]){
        try {
            System.out.println("Stmt-1");
            System.out.println("Stmt-2");
            System.out.println("Stmt-3");
        }catch (ArithmeticException A){
            A.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Stmt-4");
        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Stmt-5");
    }
}

/* Case 1:  If there is no exception Stmt-1,Stmt-2,Stmt-3,Finally block,Stmt-5
   Case 2 : if an exception is raised at stmt 2 and corresponding catch block is  matched  Stmt-1,"Stmt-4,Finally block,Stmt-5
   Case 3:  if an exception is raised at stmt 2 and corresponding catch block is not matched   Stmt-1,Stmt-5
   Case 4:  if an exception is raised at stmt -- Finally block
   Case 5 : If exception raised at Stmt-5  abnormal termination

 */