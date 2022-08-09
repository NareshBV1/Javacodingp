package Strings;

public class Reversestring {


     // Reverse a string without Reverse function
      public String  reversestring(String str){
          String Reversestring  = "";
          for(int i=0 ; i<str.length();i++){
              char c = str.charAt(i);
              Reversestring =  c + Reversestring ;
          }
          return Reversestring;
      }


    // Reverse a string with string buffer
    public StringBuffer reversestring1(String str) {
        StringBuffer reversestring = new StringBuffer("");
        if (str.length() != 0) {
            StringBuffer sb = new StringBuffer(str);
            reversestring = sb.reverse();

        }
        return reversestring;
    }

    public  static void main(String args[]){
        Reversestring n = new Reversestring();
        String str5 = n.reversestring("I am working on selenium");
        System.out.println(str5);

        StringBuffer str6 = n.reversestring1("i am working on selenium");
        System.out.println(str6);
    }
}
