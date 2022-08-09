package Interview;

public class Test2 {


   //  Print Numbers between 1 to 50
   //if the number is divisible by 3 print "Three"
   // if the number is divisible by 5 print "Five"
    // if the number is divisible by both print "Bingo"

    public static void main(String args[]){
        for(int i=1;i<=50;i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("Bingo");
                }else if (i % 5 ==0 ){
                System.out.println("Five");
            }else if (i % 3 == 0){
                System.out.println("Three");
            }else{
                System.out.println(i);
            }
            }

        }
    }





