package design_pattern.creational.singleton;

public class DCLSingleton {

    private static DCLSingleton INSTANCE = null;

    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if(INSTANCE == null){
            synchronized(DCLSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
}