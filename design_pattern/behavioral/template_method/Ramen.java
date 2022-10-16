package design_pattern.behavioral.template_method;

public abstract class Ramen {
    
    public void make() {
        boilWater();
        putNoodles();
        putIngredients();
        waiting();
        complete();
    }

    public void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    public void putNoodles() {
        System.out.println("면을 넣습니다.");
    }

    public abstract void putIngredients();

    public void waiting() {
        System.out.println("3분을 기다립니다.");
    }

    public abstract void complete();
}
