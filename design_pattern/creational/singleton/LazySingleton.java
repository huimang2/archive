package design_pattern.creational.singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}