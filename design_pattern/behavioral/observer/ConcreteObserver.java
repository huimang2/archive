package design_pattern.behavioral.observer;

public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(name + " > 새로운 글이 등록되었습니다 : " + title);
    }
    
}
