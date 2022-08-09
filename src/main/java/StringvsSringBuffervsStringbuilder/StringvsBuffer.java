package StringvsSringBuffervsStringbuilder;

public class StringvsBuffer {

    public static void main(String args[]) {

// String is immutable   // string buffer is mutable
        //Case 1
           // new object will be created with concatanation since it's doesnt have any reference it is elgible for garbage collection
        String s1 = new String("Naresh");
        s1.concat("Software");
        System.out.println(s1);

        // Changes will be made in the same object
        StringBuffer s2 = new StringBuffer("Naresh");
        s2.append("software");
        System.out.println(s2);



        // Case 2
        String S3 = new String("Naresh");
        String S4 = new String("Suresh");
        boolean val = (S3==S4); // False --> It will compare the references of the objects , if both reference are pointing to the same object then it ll return true otherwise false
        boolean val1 = S3.equals(S4); // It will compare the content , if content marches it ll return true otherwise false


        StringBuffer S5 = new StringBuffer("Naresh");
        StringBuffer S6 = new StringBuffer("Suresh");
        boolean val3 = (S5==S6); // False --> It will compare the references of the objects , if both reference are pointing to the same object then it ll return true otherwise false
        boolean val4 = S3.equals(S4); // In stringbuffer equals method is not overidden from object class so it ll compare the object references.


       //  Case 3


    }
}
