package String;

import java.lang.reflect.Method;


public class StringClassMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class  obj = Class.forName("java.lang.String");
        Method[] declaredMethods = obj.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }

    }
}
