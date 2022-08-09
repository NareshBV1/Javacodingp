package Strings;

public class Rpelacecharcase {

    // Java program to replace upper case chars with lower case and lower chars with uppercase using Asc!!
    // lowercase a-z == 97-122
    // Uppercase A-Z == 65-90
    // Numbers   0-9 == 48-57
    public void convertcase(String str){
        String str3 = "";
        String str2 = "";
        if(str.length()!=0){
            for(int i=0;i<str.length();i++){
                int n = (int) str.charAt(i);
                if(n >=97 && n<=122){
                    str2 = str.substring(i,i+1).toUpperCase();
                    //System.out.print(str2);
                } else if (n>=65 && n<=90) {
                    str2 =str.substring(i,i+1).toLowerCase();
                    //ystem.out.print(str2);
                } else if ((n >=48 && n<=57) ||  (n>=32 && n<=47) || (n>=60 && n<=64) ||  (n>=91 && n<=96)  ) {
                    str2 =str.substring(i,i+1);
                }
                str3 = str3 + str2;
            }
            System.out.println(str3);
        }

    }


    // Java program to replace upper case chars with lower case and lower using character array
    public void convertcase1(String str){
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }else if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
    }


    public  static void main(String args[]){

        Rpelacecharcase t = new Rpelacecharcase();
        t.convertcase("This is water Bottle");
    }


}
