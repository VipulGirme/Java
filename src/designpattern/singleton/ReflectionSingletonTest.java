package src.designpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton instanceTwo = null;

        try {
            Constructor [] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
            for(Constructor constructor: constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializationSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
//        1791741888
//        1595428806


    }
}
