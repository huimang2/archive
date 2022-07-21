package design_pattern.behavioral.chain_of_responsibility;

public abstract class Handler {

    private Handler nextHandler = null;

    public final void handleRequest(App app) {
        handle(app);
        if(nextHandler != null) nextHandler.handleRequest(app);
    }

    protected abstract void handle(App app);
    
    public final Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    };
}
