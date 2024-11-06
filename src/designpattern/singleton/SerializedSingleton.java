package src.designpattern.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -7604766932017737115L;

    private static final SerializedSingleton INSTANCE = new SerializedSingleton();

    private SerializedSingleton() {
    }

    public static SerializedSingleton getInstance() {
        return INSTANCE;
    }
    /* This method is added to prevent Singleton breaking by Serialization */
    protected Object readResolve() {
        return getInstance();
    }
}
