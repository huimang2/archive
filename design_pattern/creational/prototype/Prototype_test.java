package design_pattern.creational.prototype;

public class Prototype_test {
    
    public static void main(String[] args) {
        Skill skill1 = new Skill();
        Skill skill2 = (Skill) skill1.clone();

        skill1.add("천상의 멜로디");
        skill2.add("신성한 빛");

        System.out.println(skill1.toString());
        System.out.println(skill2.toString());
    }
}
