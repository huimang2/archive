package design_pattern.structural.flyweight;

public class Knife extends Weapon {
    
    Knife() {
        super("단검", 10, 1, 1);
    }

    @Override
    public void attack() {
        System.out.println("단검으로 공격!");
    }
}

