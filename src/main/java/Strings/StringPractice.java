package Strings;

public class StringPractice {
    public static void main(String args[]) {

        String str1 = "Today is hot day and today is cool day";
        String str2 = "Today is hot day and today is cool day";

        // String Functions
        int l = str1.length();
        System.out.println(l);
        char c = str1.charAt(0);
        System.out.println(c);

        int p = str1.indexOf("oday");
        System.out.println(p);

       int y = str1.lastIndexOf("today");
       System.out.println(y);

        // Compareto -- it will compare the unicode values
        //Str1<Str2 = -1
        //Str1>Str2 = 0
         int n = str1.compareTo(str2);
         System.out.println(n);

         int m =str1.compareToIgnoreCase(str2);
         System.out.println(m);

         // String content comparision
         boolean val = str1.equals(str2);
         System.out.println(val);

         // It will compare the object reference, if both the reference pointing to the same object it's true otherwise its false
         boolean val1 = str1 == str2;
         System.out.println(val1);

         // Contact
         String s3 = str1.concat("Hello");
         System.out.println(s3);

         // Contains -- will check the sequence of characters
            boolean Z = str1.contains("to");
            System.out.println(Z);

        //Substring
        String Str4 = str1.substring(5);
        System.out.println(Str4);
        String Str5 = str1.substring(5,11);
        System.out.println(Str5);

        // Startwith
         boolean val4 = str1.startsWith("To");
         System.out.println(val4);

         //Endswith
        boolean val5 = str1.endsWith("WX");
        System.out.println(val5);

        String s8 = str1.replace("Today" , "today");
        System.out.println(s8);

        // String to  Array
        String[] A =str1.split(" ");
        System.out.println(A[0]);

        // String to Charaary
        char[] Ch =str1.toCharArray();
        for (char i: Ch) {
            System.out.print(i);

        }


    }
}
