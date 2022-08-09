package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharsinstring {
    // Java Program to get the repeated characters in a string
    public HashMap repeatecchars(String str) {
        String s5 = str.replace(" ","").toLowerCase();
        char[] a = s5.toCharArray();
        HashMap m = new HashMap();
        if (a.length != 0) {
            for (int i = 0; i < a.length; i++) {
                int count = 1;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j] && i != j) {
                        count = count + 1;
                    }
                }
                m.put(a[i], count);

            }
        }
        return m;
    }

    public static void main(String args[]){
        RepeatedCharsinstring t = new RepeatedCharsinstring();
       Map m =  t.repeatecchars("Today is hot day");
       System.out.println(m);
    }

}
