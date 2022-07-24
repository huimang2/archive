package design_pattern.behavioral.mediator;

public class Chat {
    public static void main(String[] args) {
        
        Mediator mediator = new ConcreteMediator();

        Colleague user1 = new ConcreteColleague(mediator, "사나");
        Colleague user2 = new ConcreteColleague(mediator, "나연");
        Colleague user3 = new ConcreteColleague(mediator, "모모");
        Colleague user4 = new ConcreteColleague(mediator, "다현");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("안녕하세요!");

        mediator.deleteUser(user3);
    }
}
