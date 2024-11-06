package src.designpattern.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while instantiating");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
    /*
    Both eager initialization and static block initialization create the instance even before it’s being used and that is not the best practice to use.
     */
}
