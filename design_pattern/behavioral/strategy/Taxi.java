package design_pattern.behavioral.strategy;

public class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시를 운전합니다.");
    }
    
}
