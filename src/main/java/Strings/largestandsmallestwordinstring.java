package Strings;

public class largestandsmallestwordinstring {
    //  Java Program to find the largest and smallest word in a string
    public void largestandsmallest(String str) {
        String  small = "";
        String large = "";
        String[] Arr1 = str.split(" ");

        for (int k = 0; k < Arr1.length; k++) {
            if(Arr1[0].length() >  Arr1[k].length()){
                small = Arr1[k];
            }

            if(Arr1[0].length() < Arr1[k].length()){
                large = Arr1[k];
            }

        }
        System.out.println("smallest"+ ":" +small);
        System.out.println("smallest"+ ":" +large);

    }



    public static void main(String args[]){
        largestandsmallestwordinstring m = new largestandsmallestwordinstring();
        m.largestandsmallest("Today is hot day");


    }

}
