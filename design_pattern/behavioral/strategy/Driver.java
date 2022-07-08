package design_pattern.behavioral.strategy;

public class Driver implements Vehicle {

    private Vehicle vehicle;

    public Driver() {}

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run() {
        
        if(vehicle == null) System.out.println("걸어갑니다.");
        else vehicle.run();
    }
}
