package design_pattern.creational.factory;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if("Dog".equals(type)) {
            return new Dog("Dog", "Mung");
        } else if("Cat".equals(type)) {
            return new Dog("Cat", "Navi");
        } else {
            return null;
        }
    }
}