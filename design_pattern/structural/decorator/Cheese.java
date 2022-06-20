package design_pattern.structural.decorator;

public class Cheese extends Decorator {
    
    public Cheese(Component ramen) {
        super(ramen);
    }

    @Override
    public String make() {
        return "치즈 " + super.make();
    }
}
