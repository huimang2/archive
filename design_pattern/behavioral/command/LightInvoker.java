package design_pattern.behavioral.command;

public class LightInvoker {
    
    Command turnOn;
    Command turnOff;

    public LightInvoker(Command turnOn, Command turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void turnOn() {
        turnOn.execute();
    }

    public void turnOff() {
        turnOff.execute();
    }

}
