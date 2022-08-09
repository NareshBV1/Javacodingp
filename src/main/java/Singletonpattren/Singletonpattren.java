package Singletonpattren;

public class Singletonpattren {

  /*  For any java class if we are allowed to create only one object such type of class is called singleton class
    Example : Runtime , business delegate, service locator etc..

    Advantage of singleton class:
    If several people have same requirement then it is not recommended to create a separate object for every requirement
     we have to create only on object  and we can reuse same object for every similar requriment so that performace and memory
      utilizations ll be improved. This is the central idea of singleton classes
   */

    private static Singletonpattren s = null;
    private Singletonpattren() {

    }

    public static Singletonpattren  getpattren() {
        if (s == null) {
            s = new Singletonpattren();
        }
        return s;
    }

}
