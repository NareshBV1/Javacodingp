package Interview;

public class interviewQuestions {


    // I  am  Working on Selenium
    // muineles  no gn ikrowmaI

    // 1 . Reversed the string character
    // 2 .provideed spaces as requried
    // 3 . Removed spaces

    // I am working on Selenium
    // m ui neleSno gn ikrowmaI

    public static void main(String args[]) {

        String str = "I  am  Working on Selenium";
          String Reversedtring = "";
        for (int i = str.length(); i > 0 ; i--) {
            char c = str.charAt(i-1);
            Reversedtring = Reversedtring + c;
        }
       String ccc  = Reversedtring.replace("gni","gn i");
        System.out.println(ccc);
    }
}



