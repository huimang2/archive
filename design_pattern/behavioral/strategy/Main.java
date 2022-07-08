package design_pattern.behavioral.strategy;

public class Main {
    
    public static void main(String[] args) {
        
        Driver driver = new Driver();
        driver.run();

        Vehicle bus = new Bus();

        driver.setVehicle(bus);
        driver.run();

    }
}
