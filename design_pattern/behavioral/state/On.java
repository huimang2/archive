package design_pattern.behavioral.state;

public class On implements State {

    private static final On INSTANCE = new On();

    private On(){}

    public static On getInstance() {
        return INSTANCE;
    }

    
    public void longPush(Switch computerSwitch) {
        System.out.println("컴퓨터가 꺼집니다.");
        computerSwitch.setState(Off.getInstance());
    }

    @Override
    public void toggle(Switch computerSwitch) {
        System.out.println("최대절전모드가 됩니다.");
        computerSwitch.setState(Hibernate.getInstance());
    }
}
