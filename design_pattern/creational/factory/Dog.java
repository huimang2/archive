package design_pattern.creational.factory;

public class Dog extends Animal {
    private String type;
    private String name;

    public Dog(String type, String name) {
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
