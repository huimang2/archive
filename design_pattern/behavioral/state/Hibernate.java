package design_pattern.behavioral.state;

public class Hibernate implements State {
    
    private static final Hibernate INSTANCE = new Hibernate();

    private Hibernate(){}

    public static Hibernate getInstance() {
        return INSTANCE;
    }

    @Override
    public void toggle(Switch computerSwitch) {
        System.out.println("컴퓨터가 켜집니다.");
        computerSwitch.setState(On.getInstance());
    }

}
