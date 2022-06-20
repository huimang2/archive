package design_pattern.structural.decorator;

public class Decorator implements Component {
    
    private Component ramen;

    public Decorator(Component ramen) {
        this.ramen = ramen;
    }

    @Override
    public String make() {
        return ramen.make();
    }
}
