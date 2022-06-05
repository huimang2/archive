package design_pattern.creational.factory;

public class LGComputer extends Computer {
    
    private static final String manufacture = "LG";
    public static final String brandName = "Gram";

    @Override
    public Computer createComputer(){
        System.out.println("Create " + manufacture + brandName + "...");
        return this;
    }
}
