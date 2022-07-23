package design_pattern.behavioral.chain_of_responsibility;

public class Client {
    
    public static void main(String[] args) {
        new App().setFrontend(new Frontend()).makeApp();
    }
}
