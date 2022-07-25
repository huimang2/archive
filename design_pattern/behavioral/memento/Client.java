package design_pattern.behavioral.memento;

public class Client {
    
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("상태1");
        careTaker.add(originator.createMemento());

        originator.setState("상태2");
        careTaker.add(originator.createMemento());

        originator.setState("상태3");
        careTaker.add(originator.createMemento());

        originator.setMemento(careTaker.get(0));
        System.out.println("처음 상태 : " + originator.getState());

        originator.setMemento(careTaker.get(1));
        System.out.println("이전 상태 : " + originator.getState());

        originator.setMemento(careTaker.get(2));
        System.out.println("마지막 상태 : " + originator.getState());
        
    }
}
