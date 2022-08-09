package Constructor;

/*Once we create an object compulsory we should perform initialization then only the object is in a position to respond properly.
Whenever we are creating an object some piece of the code will be executed automatically to perform initialization of the object ,
this piece of the code is nothing but constructor, hence the main purpose of constructor is to perform initialization of an object
 */

/*
Diffrence b/w constructor and instance block:
 The main purpose of constructor is to perform object initialization
But other than initialization if we want to perform any activity for every object creation then we should go for instance
block(like updating one entry in the database for every object creation or incrementing count value for every object creation)
 Both instance block and constructor have their own purposes and replacing once concept with another concept may not work always
 Both constructor ll be executed for every object creation but instance block execute first and constructor ll execute /*
 */

// Constructor ll not be having any return type

/* The only applicable modifiers for constructors are public ,private, protected, default if we are trying to use any other modifier
we ll get compile time error*/




public class ConstructorExample {
    int i;
    static  int count = 0;
    String str ;
    public ConstructorExample(){
    }
    public ConstructorExample(int i , String str){
        this.i = i;
        this.str = str;
    }

    {
         count++;
        System.out.println("First instance block");
    }
}
