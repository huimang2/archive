package design_pattern.structural.flyweight;

public class Fist extends Weapon {
    
    Fist() {
        super("주먹", 5, 1, 0);
    }

    @Override
    public void attack() {
        System.out.println("주먹으로 공격!");
    }
}
