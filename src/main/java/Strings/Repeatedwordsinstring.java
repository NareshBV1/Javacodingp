package Strings;

import java.util.HashMap;
import java.util.Map;

public class Repeatedwordsinstring {
    // Find the repeated words in a string
    public HashMap repeatedwords(String str){
        HashMap m = new HashMap();
        String[] a = str.split(" ");
        if(a.length!=0){
            for(int i=0;i<a.length;i++){
                int count =1;
                for(int j=0;j<a.length;j++){
                    if(a[i].toLowerCase().equals(a[j].toLowerCase()) && i!=j){
                        count = count+1;
                    }
                }
                m.put(a[i].toLowerCase(),count);
            }

        }

        return m;
    }

    public static void main(String args[]){
        Repeatedwordsinstring m = new Repeatedwordsinstring();
     Map d =m.repeatedwords("Today is hot day and today is cool day");
     System.out.println(d);

    }
}
