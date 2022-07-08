package design_pattern.behavioral.state;

public class Switch {
    
    private State state = Off.getInstance();

    public void toggle() {
        state.toggle(this);
    }

    public void longPush() {
        if(state instanceof On) ((On) state).longPush(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
