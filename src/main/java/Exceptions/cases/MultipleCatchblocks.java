package Exceptions.cases;

public class MultipleCatchblocks {
    public  static void main(String args[]){
        try {
            int x = 10/0;

        }catch (NullPointerException N){
            System.out.println("Nullpointer exeption");

        }catch ( ArithmeticException A){
            System.out.println("ArithmeticException exeption");
            // System.exit(0); Normal termination // It will terminate the programe and it wont execute any code after this including final blocl
               System.exit(1); // Abnormal termination // It will terminate the programe and it wont execute any code after this including final blocl

        }catch (IndexOutOfBoundsException I){
            System.out.println("IndexOutOfBoundsException exeption");

        }catch (Exception e){
            System.out.println("Exception");

        }finally {  // Final block will always execute
            System.out.println("Final block");
        }
        }


}
