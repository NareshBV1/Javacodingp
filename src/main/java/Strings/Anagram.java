package Strings;

import java.util.Arrays;

public class Anagram{

        // Strings are anagram
        public void Anagram(String str1 , String str2){
            char[] c1 = str1.toCharArray();
            char[] c2 =str2.toCharArray();

            if(c1.length==c2.length){
                Arrays.sort(c1);
                Arrays.sort(c2);
                if(Arrays.equals(c1,c2)){
                    System.out.println("Strings are anagram");
                }else{
                    System.out.println("Strings are not anagram");
                }


            }else {
                System.out.println("Strings are not anagram");

            }

        }

        public static void main(String args[]){

            Anagram v = new Anagram();
            v.Anagram("Naresh","hserNa");


        }
}

