package Strings;

public class StringNequalparts {
    // Divide the string into  n equal parts
    public void Equalparts(String str, int n){
        String[] s1 = new String[3];
        int  temp = 0;
        int m = str.length();
        int  chars = m/n;
        if (m % n==0){
            for(int i = 0 ; i < str.length();i = i + chars ){
                s1[temp] = str.substring(i,i+chars);
                temp++;
            }
        }else{
            System.out.println("String cannot be divided into equal parts");

        }
        for (String i : s1) {
            System.out.println(i);

        }
    }


    public  static void main(String args[]){
        StringNequalparts n = new StringNequalparts();
        n.Equalparts("ThiisNaresh1",3);
    }

}
