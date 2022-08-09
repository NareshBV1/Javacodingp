package Strings;

public class palindrome {
    //  Given string is a palindrome
    public void palindrome(String str) {
        String Reversestring = "";
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                Reversestring = c + Reversestring;
            }
            if (str.equalsIgnoreCase(Reversestring)) {
                System.out.println("Strings are palindrome");
            } else {
                System.out.println("Strings are not palindrome");
            }

        }

    }

    public static void main(String args[]){
        palindrome p = new palindrome();
        p.palindrome("Madam");
    }


}
