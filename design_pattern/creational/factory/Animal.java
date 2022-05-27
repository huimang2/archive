package design_pattern.creational.factory;

// Super Class
public abstract class Animal {
    public abstract String getName();
    public abstract String getType();

    @Override
    public String toString() {
        return "Animal Type : " + getType() + "\n" + "Animal Name : " + getName() + "\n";
    }
}
