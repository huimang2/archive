package design_pattern.creational.factory;

public class SamsungComputer extends Computer {
    
    private static final String manufacture = "Samsung";
    public static final String brandName = "GallaxyBook";

    @Override
    public Computer createComputer(){
        System.out.println("Create " + manufacture + brandName + "...");
        return this;
    }
}
