package src.designpattern.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

    /*
     * If your singleton class is not using a lot of resources,
     * this is the approach to use. But in most of the scenarios,
     * singleton classes are created for resources such as File System, Database connections, etc.
     * We should avoid the instantiation unless the client calls the getInstance method.
     * Also, this method doesn’t provide any options for exception handling.
     * */
}
