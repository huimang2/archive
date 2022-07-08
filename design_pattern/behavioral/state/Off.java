package design_pattern.behavioral.state;

public class Off implements State {

    private static final Off INSTANCE = new Off();

    private Off(){}

    public static Off getInstance() {
        return INSTANCE;
    }

    @Override
    public void toggle(Switch computerSwitch) {
        System.out.println("컴퓨터가 켜집니다.");
        computerSwitch.setState(On.getInstance());
    }
}
