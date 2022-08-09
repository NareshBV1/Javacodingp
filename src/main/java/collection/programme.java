package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class programme {
    public static void main(String args[]){
        programme P = new programme();
        P.findduplicatewords("Today is hot day and Today is friday");

    }




    public void findduplicatewords(String str){
        String[] strsplit=str.split(" ");
        ArrayList AL = new ArrayList(Arrays.asList(strsplit));
        int TodayLastOccurence  = AL.lastIndexOf("Today");
        int isLastOccrence = AL.lastIndexOf("is");
        System.out.println(TodayLastOccurence);
        System.out.println(isLastOccrence);

        for (Object object :AL) {
            System.out.println(object);
        }




    }

}
