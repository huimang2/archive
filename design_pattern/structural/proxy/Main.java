package design_pattern.structural.proxy;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("\n" + "Proxy를 통한 호출");
        IServerModule proxy = new Proxy();
        proxy.execute();
    }
}
