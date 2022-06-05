package design_pattern.creational.factory;

public class AppleComputer extends Computer {

    private static final String manufacture = "Apple";
    public static final String brandName = "MacBook";

    @Override
    public Computer createComputer(){
        System.out.println("Create " + manufacture + brandName + "...");
        return this;
    }
}
