package design_pattern.creational.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}