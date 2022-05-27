package design_pattern.creational.factory;

public class Cat extends Animal {
    private String type;
    private String name;

    public Cat(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }   
}
