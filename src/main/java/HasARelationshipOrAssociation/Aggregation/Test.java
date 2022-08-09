package HasARelationshipOrAssociation.Aggregation;

public class Test {
    public static void main(String args[]) {
        Driver D = new Driver("Ram", 4);

        Car cr = new Car("Daniel",4);
        D.c = cr;

        D = null;
        cr.wheels = 4;




    }


}
