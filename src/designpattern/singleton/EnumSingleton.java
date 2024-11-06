package src.designpattern.singleton;

public enum EnumSingleton {

    INSTANCE;

    boolean doSomething() {
        System.out.println("Enum");
        return false;
    }
}
