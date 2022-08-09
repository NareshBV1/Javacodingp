package Strings;


public class Swappingintegers {
    int a;
    int b;

    public static void main(String args[]){
        Swappingintegers t = new Swappingintegers();
        t.swap(3,2);
    }


    public void swap(int a , int b) {
        /* a = a+b;       /
         b = a-b;
         a = a-b; */
        int temp;

        temp = a;
        a= b;
        b= temp;

        System.out.println(" a "+ "= "+ a +" b "+" = "+ b);

    }
}