package HasARelationshipOrAssociation.Composition;

public class Test {
    public  static void main(String args[]) {

        Human H = new Human("Daniel", 45, new Heart("72", 4));
        // When the human object is create along with it heart object is also got created both objects are
        // strongly associated to each other , if you have destroyed human object heart object ll also get destroyed
        // h = null;  // Now both objects are elgibel for garbage collection
        H.m3();

        //H = null;
        H.h = null;
        H.h.m1();






    }

}
