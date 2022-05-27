package design_pattern.creational.factory;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal a = AnimalFactory.getAnimal("Dog");
        Animal b = AnimalFactory.getAnimal("Cat");

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
