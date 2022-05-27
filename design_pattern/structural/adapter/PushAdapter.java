package design_pattern.structural.adapter;

import java.util.ArrayList;

public interface PushAdapter {
    public void PushMessage(Person person);
    public void PushMessages(ArrayList<Person> personObj);
}
