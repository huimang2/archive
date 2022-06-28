package design_pattern.structural.flyweight;

public class Spear extends Weapon {
    
    Spear() {
        super("창", 15, 2, 3);
    }

    @Override
    public void attack() {
        System.out.println("창으로 공격!");
    }
}
