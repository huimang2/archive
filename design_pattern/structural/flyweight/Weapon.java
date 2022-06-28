package design_pattern.structural.flyweight;

public abstract class Weapon {

    private String name;
    private int att;
    private int distance;
    private int changeTime;

    public abstract void attack();

    public Weapon(String name, int att, int distance, int changeTime) {
        this.name = name;
        this.att = att;
        this.distance = distance;
        this.changeTime = changeTime;
    }

    public String getName() {
        return this.name;
    }

    public int getAtt() {
        return this.att;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getChangeTime() {
        return this.changeTime;
    }
}