package design_pattern.structural.adapter;

import java.util.ArrayList;

public class PushAdapterImpl extends SendMessage implements PushAdapter {
    
    @Override
    public void PushMessage(Person personObj) {
        this.SendMessage(personObj);
    }

    @Override
    public void PushMessages(ArrayList<Person> personObjList) {
        for (Person personObj : personObjList) {
            this.SendMessage(personObj);
        }
    }
}
