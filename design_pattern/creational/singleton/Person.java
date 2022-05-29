package design_pattern.creational.singleton;

public class Person {
    
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void donation(int amount){
        Donation donation = Donation.getInstance();
        donation.donation(this.name, amount);
    }
}