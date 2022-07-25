package design_pattern.behavioral.template_method;

public class Main {
    
    public static void main(String[] args) {
        
        Ramen cheeseRamen = new CheeseRamen();
        Ramen seafoodRamen = new SeafoodRamen();
        Ramen kimchRamen = new KimchiRamen();

        cheeseRamen.make();
        System.out.println("-------------------");
        seafoodRamen.make();
        System.out.println("-------------------");
        kimchRamen.make();
    }
}
