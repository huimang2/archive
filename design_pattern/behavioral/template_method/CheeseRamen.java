package design_pattern.behavioral.template_method;

public class CheeseRamen extends Ramen {

    @Override
    public void complete() {
        System.out.println("치즈라면 완성!!");
    }

    @Override
    public void putIngredients() {
        System.out.println("치즈를 넣습니다.");
    }
    
}
