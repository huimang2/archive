package design_pattern.structural.proxy;

public class SererModule implements IServerModule {
    
    @Override
    public void execute() {
        System.out.println("Run Server Module");
    }
}
