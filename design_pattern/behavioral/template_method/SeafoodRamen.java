package design_pattern.behavioral.template_method;

public class SeafoodRamen extends Ramen {

    @Override
    public void complete() {
        System.out.println("해물라면 완성!!");
    }

    @Override
    public void putIngredients() {
        System.out.println("해물을 넣습니다.");
    }
    
}
