package Strings;

public class ExtractSubstring{
        // Extract a substring from a string
        public String Extractsubstr(String str, String substr) {
            String Substring1 = null;
            if (str.length() != 0) {
                int substringstartpos = str.indexOf(substr);
                int substringEndpos = substringstartpos + substr.length();
                Substring1 = str.substring(substringstartpos, substringEndpos);
            }

            return Substring1;
        }

        public static void main(String args[]){
            ExtractSubstring t = new ExtractSubstring();
            String y = t.Extractsubstr("This is Naresh", "Naresh");
            System.out.println(y);

         }
}
