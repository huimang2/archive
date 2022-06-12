package design_pattern.structural.adapter;

public class SendMessage {
    public void SendMessage(Person personObj) {
        System.out.println(
            "To : " + personObj.getPhone() + "\n" + 
            "Message : " + personObj.getName() + "\n"
        );
    }
}
