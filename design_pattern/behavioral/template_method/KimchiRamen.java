package design_pattern.behavioral.template_method;

public class KimchiRamen extends Ramen {

    @Override
    public void complete() {
        System.out.println("김치라면 완성!!");
    }

    @Override
    public void putIngredients() {
        System.out.println("김치를 넣습니다.");
    }
    
}
