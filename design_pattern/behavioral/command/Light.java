package design_pattern.behavioral.command;

public class Light {
    
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void TurnOn() {
        System.out.println(location + " 전등을 켭니다.");
    }

    public void TurnOff() {
        System.out.println(location + " 전등을 끕니다.");
    }
}
