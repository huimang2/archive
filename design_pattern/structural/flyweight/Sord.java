package design_pattern.structural.flyweight;

public class Sord extends Weapon {
    
    Sord() {
        super("장검", 10, 2, 2);
    }

    @Override
    public void attack() {
        System.out.println("장검으로 공격!");
    }
}
