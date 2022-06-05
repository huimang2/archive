package design_pattern.creational.factory;

public abstract class Computer {
    
    protected enum Manufacture {
        SAMSUNG, LG, APPLE
    }

    public abstract Computer createComputer();

    public static Computer ComputerFactory(Manufacture manufacture) {

        Computer computer = null;

        switch(manufacture){
            case SAMSUNG:
                computer = new SamsungComputer();
                break;
            case LG:
                computer = new LGComputer();
                break;
            case APPLE:
                computer = new AppleComputer();
                break;
            default:
                System.out.println("invalid manufacture.");
                break;
        }
        
        return computer;
    }
}
