package design_pattern.creational.factory;

public abstract class Animal {
    public abstract String getName();
    public abstract String getType();

    @Override
    public String toString() {
        return "Animal Type : " + getType() + "\n" + "Animal Name : " + getName() + "\n";
    }
}
