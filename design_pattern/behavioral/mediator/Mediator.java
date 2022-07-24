package design_pattern.behavioral.mediator;

public interface Mediator {
    void addUser(Colleague user);
    void deleteUser(Colleague user);
    void sendMessage(String message, Colleague user);
}
