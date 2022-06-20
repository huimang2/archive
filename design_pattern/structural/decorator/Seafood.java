package design_pattern.structural.decorator;

public class Seafood extends Decorator {
    
    public Seafood(Component ramen) {
        super(ramen);
    }

    @Override
    public String make() {
        return "해물 " + super.make();
    }
}