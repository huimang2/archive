package design_pattern.behavioral.mediator;

public class ConcreteColleague extends Colleague {
    
    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String msg) {
        System.out.println("수신 > " + this.name + " : " + msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("발신 > " + this.name + " : " + msg);
        mediator.sendMessage(msg, this);
    }
}