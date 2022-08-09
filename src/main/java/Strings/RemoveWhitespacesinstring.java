package Strings;

public class RemoveWhitespacesinstring {


    // Java programe to remove all the white spaces in a string.
    public String removewhitespaces(String str){
        String str3 = null;
        if(str.length()!=0){
            str3 = str.replace(" ","");
        }
        return str3;
    }

    public static void main(String args[]){
        RemoveWhitespacesinstring t = new RemoveWhitespacesinstring();
        String Str4 = t.removewhitespaces("This is water bottle");
        System.out.println(Str4);
    }
}
