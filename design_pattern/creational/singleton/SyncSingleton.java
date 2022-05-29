package design_pattern.creational.singleton;

public class SyncSingleton {

    private static SyncSingleton INSTANCE = null;

    private SyncSingleton() {}

    public static synchronized SyncSingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new SyncSingleton();
        }
        return INSTANCE;
    }
}
