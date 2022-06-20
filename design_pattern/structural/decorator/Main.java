package design_pattern.structural.decorator;

public class Main {
    
    public static void main(String[] args) {
        
        Component ramen = new Ramen();
        System.out.println(ramen.make());

        Component kimchRamen = new Kimchi(new Ramen());
        System.out.println(kimchRamen.make());

        Component seafoodRamen = new Seafood(new Ramen());
        System.out.println(seafoodRamen.make());

        Component cheeseRamen = new Cheese(new Ramen());
        System.out.println(cheeseRamen.make());
    }
}
