package Strings;

public class Totalnumcharsinstring {

    // Java program to find the total number of characters in a string
    public int totalchars(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;
        return n;
    }

    // using loop
    public int totalchars1(String str){
        int count = 0;
        if(str.length()!=0){
            for(int i=0;i<str.length();i++){
                count++;
            }
        }
        return count++;
    }

    // Java Program to count the total number of characters in a string , do not  consider spaces
    public int charcountwithoutspaces(String str) {
        int count = 0;
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    count++;
                }
            }
        }
        return count++;
    }
   // using length function
    public static void main(String args[]){
        Totalnumcharsinstring t= new Totalnumcharsinstring();
         int n =  t.totalchars("Today is hot day");
         System.out.println(n);
    }


}
