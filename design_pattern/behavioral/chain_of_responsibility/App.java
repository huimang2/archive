package design_pattern.behavioral.chain_of_responsibility;

public class App {
    
    private Frontend frontend;
    private Backend backend;
    private Database database;

    public Frontend getFrontend() {
        return frontend;
    }

    public Backend getBackend() {
        return backend;
    }

    public Database getDatabase() {
        return database;
    }

    public void makeApp() {

        Handler handler = new Backend();

        handler .setNextHandler(new Database())
                .setNextHandler(new Frontend());
        
        handler.handleRequest(this);
    }

    public App setFrontend(Frontend frontend) {
        this.frontend = frontend;
        return this;
    }

    public App setBackend(Backend backend) {
        this.backend = backend;
        return this;
    }

    public App setDatabase(Database database) {
        this.database = database;
        return this;
    }
}
