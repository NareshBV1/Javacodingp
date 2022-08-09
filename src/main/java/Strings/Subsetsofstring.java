package Strings;

import sun.lwawt.macosx.CSystemTray;

public class Subsetsofstring{
        // Program to find all subsets of a string(len*(len+1)/2
        public void subsets(String str){
            int n = str.length();
            String s1[] = new String[n*(n+1)/2];
            int temp = 0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    s1[temp] = str.substring(i,j+1);
                    temp++;
                }

                }
            for (String st : s1){
                System.out.println(st);
            }
        }

        public static void main(String args[]){

            Subsetsofstring v1 = new Subsetsofstring();
            v1.subsets("ABC");
        }
}
