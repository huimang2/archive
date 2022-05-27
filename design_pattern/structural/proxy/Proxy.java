package design_pattern.structural.proxy;

public class Proxy implements IServerModule {
    IServerModule server;
    
    @Override
    public void execute() {
        System.out.println("ServerModule의 execute() 실행 전에 proxy에서 무언가를 할 수 있음");

        server = new SererModule();
        server.execute();
    }
}
