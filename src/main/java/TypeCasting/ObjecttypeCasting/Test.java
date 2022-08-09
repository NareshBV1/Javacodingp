package TypeCasting.ObjecttypeCasting;


public class Test {
    // Rules
    // 1. L>=R
    // 2. L<(cast)R
    public static void main(String args[]) {

        // Top casting -- Equating parent reference to child  object is called top casting
        Car C = new BmwCar();

        // Downcasting
        BmwCar B = (BmwCar) C;

        // Example 2:
        Car c1 =new AudiCar();
        AudiCar A = (AudiCar) c1;

    }

}
