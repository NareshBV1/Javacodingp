package TypeCasting.PrimitiveTypecasting;

import sun.lwawt.macosx.CSystemTray;

public class PrimitiveTypeCasting {

   /* byte	1 byte	Stores whole numbers from -128 to 127
    short	2 bytes	Stores whole numbers from -32,768 to 32,767
    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */


    public static void main(String args[]){
        // Widening
        // Example 1
        byte n = 10;
        System.out.println(n);
        short s = n;
        System.out.println(s);
        int i = n;
        System.out.println(i);
        long l = n;

       //  Example 2
        int m = 20;
        long lx = m;
        System.out.println(lx);


        // Narrowing
        short  f = 20;
        byte h = (byte) f;

        long p = 10;
        int ll = (int)l;

      }




}
