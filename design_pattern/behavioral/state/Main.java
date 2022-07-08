package design_pattern.behavioral.state;

public class Main {
    
    public static void main(String[] args) {
        
        Switch computerSwitch = new Switch();

        computerSwitch.toggle();
        computerSwitch.toggle();
        computerSwitch.toggle();
        computerSwitch.longPush();
    }
}
