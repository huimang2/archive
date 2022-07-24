package design_pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        
        Subject model = new ConcreteSubject();

        Observer view1 = new ConcreteObserver("view1");
        Observer view2 = new ConcreteObserver("view2");
        Observer view3 = new ConcreteObserver("view3");

        model.registerObserver(view1);
        model.registerObserver(view2);
        model.registerObserver(view3);

        model.notifyObservers("1번째 글");
        model.notifyObservers("2번째 글");

        model.removeObserver(view2);

        model.notifyObservers("3번째 글");
    }
}
