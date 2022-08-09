package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GFG {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Test obj = new Test();
           Class cls = obj.getClass();
           System.out.println("The name of class is " + cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("The name of class is " + constructor.getName());

        Method[] methods = cls.getMethods();
        for (Method method : methods)
            System.out.println(method.getName());

        Method methodcall1
                = cls.getDeclaredMethod("method2", int.class);

        // Invoking the method at runtime
        methodcall1.invoke(obj, 19);

        // Creates object of the desired field by
        // providing the name of field as argument to the
        // getDeclaredField() method
        Field field = cls.getDeclaredField("s");

        // Allows the object to access the field
        // irrespective of the access specifier used with
        // the field
        field.setAccessible(true);

        // Takes object and the new value to be assigned
        // to the field as arguments
        field.set(obj, "JAVA");

        // Creates object of desired method by providing the
        // method name as argument to the
        // getDeclaredMethod()
        Method methodcall2
                = cls.getDeclaredMethod("method1");

        // Invokes the method at runtime
        methodcall2.invoke(obj);

        // Creates object of the desired method by providing
        // the name of method as argument to the
        // getDeclaredMethod() method
        Method methodcall3 = cls.getDeclaredMethod("method3");

        // Allows the object to access the method
        // irrespective of the access specifier used with
        // the method
        methodcall3.setAccessible(true);

        // Invoking the method at runtime
        methodcall3.invoke(obj);



    }



}

