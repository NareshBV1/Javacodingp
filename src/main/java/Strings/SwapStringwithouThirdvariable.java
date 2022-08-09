package Strings;

public class SwapStringwithouThirdvariable{

    public void swapstrings(String str1,String str2){

        str1 = str1.concat(str2); // GoodMorning

        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }


    public  static void main(String args[]){
        SwapStringwithouThirdvariable v1 = new SwapStringwithouThirdvariable();
         v1.swapstrings("Good" , "Morning");
    }


}
