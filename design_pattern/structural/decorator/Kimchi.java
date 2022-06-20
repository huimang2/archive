package design_pattern.structural.decorator;

public class Kimchi extends Decorator{
    
    public Kimchi(Component ramen) {
        super(ramen);
    }

    @Override
    public String make() {
        return "김치 " + super.make();
    }
}
